import { useState } from 'react'
import './App.css'

const TURNS = {
  X: 'x',
  O: 'o'
}

const Square = ({ children, isSelected ,updateBoard, index }) => {
  const className= `square ${isSelected ? 'is-selected' : ''}`
  
  const handleClick = () =>{
    updateBoard(index)
  }
  return (
    <div onClick={handleClick} className={className}>
      {children}
    </div>
  )
}

const WINNER_COMBOS = [
  [0,1,2],
  [3,4,5],
  [6,7,8],
  [0,3,6],
  [1,4,7],
  [2,5,8],
  [0,4,8],
  [2,4,6],

]

function App() {
  const [board, setBoard] = useState(Array(9).fill(null))
  const [turn, setTurn] = useState(TURNS.X)
  const [winner,setWinner] = useState(null) //null es que no hay ganador, y el false es que hay un empate 
  const checkWinner = (boardToCheck) => {
    //revisamos todas las combinaciones ganadoras para ver si X u O ganó
    for (const combo of WINNER_COMBOS){
      const [a,b,c] = combo
      if (
        boardToCheck[a] &&  // 0 --> x u o
        boardToCheck[a] === boardToCheck[b] && 
        boardToCheck[a] === boardToCheck[c]  
      ){
        return boardToCheck[a]
      }
    }
    // si no hay ganador
    return null
  }

  const resetGame = () =>{
    setBoard(Array(9).fill(null))
    setTurn(TURNS.X)
    setWinner(null)
  }

  const checkEndGame = (newBoard) => {
    //revisamos si no hay más espacios vacío es el tablero para saber si es un empate
    return newBoard.every((square) => square !== null)
  }

  const updateBoard = (index) => {
    //NO ACTUALIZAR ESTA POSICIÓN EN CASO DE QUE YA ESTÉ MARCADO
    if(board[index] || winner ) return
    // ACTUALIZAR EL TABLERO
    const newBoard = [...board]
    newBoard[index] = turn
    setBoard(newBoard)
    //CAMBIAR EL TURNO
    const newTurn = turn === TURNS.X ? TURNS.O : TURNS.X
    setTurn(newTurn)

    //revisar si hay ganador
    const newWinner = checkWinner(newBoard)
    if(newWinner){
      setWinner(newWinner)
    } // checkear si el juago ha terminado
    else if (checkEndGame(newBoard)){
      setWinner(false) //empate
    }
  }

  return (
    <main className='board'>
      <h1>Tres en Raya</h1>
      <section className='game'>
        {
          board.map((square, index) => {
            return (
              <Square
                key={index}
                index={index}
                updateBoard={updateBoard}
              >
                {square}
              </Square>
            )
          })
        }
      </section>

      <section className='turn'>
        <Square isSelected={turn === TURNS.X}>{TURNS.X}</Square>
        <Square isSelected={turn === TURNS.O}>{TURNS.O}</Square>
      </section>

      {
        winner !== null && (
          <section className='winner'>
            <div className='text'>
              <h2>
                {
                  winner === false
                   ? 'Empate'
                   : 'Ganó:' 
                }
              </h2>
              <header className='win'>
                {winner && <Square>{winner}</Square>}
              </header>

              <footer>
                <button onClick={resetGame}>Empezar de nuevo</button>
              </footer>
            </div>
          </section>
        )
      }

    </main>
  )
}

export default App
