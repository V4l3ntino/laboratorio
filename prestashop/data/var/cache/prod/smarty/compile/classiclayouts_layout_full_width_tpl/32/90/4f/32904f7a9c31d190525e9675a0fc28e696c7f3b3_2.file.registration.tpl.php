<?php
/* Smarty version 3.1.43, created on 2024-03-26 09:37:08
  from '/var/www/html/themes/classic/templates/customer/registration.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.43',
  'unifunc' => 'content_660289343a6f65_54612695',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '32904f7a9c31d190525e9675a0fc28e696c7f3b3' => 
    array (
      0 => '/var/www/html/themes/classic/templates/customer/registration.tpl',
      1 => 1651952840,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_660289343a6f65_54612695 (Smarty_Internal_Template $_smarty_tpl) {
$_smarty_tpl->_loadInheritance();
$_smarty_tpl->inheritance->init($_smarty_tpl, true);
?>


<?php 
$_smarty_tpl->inheritance->instanceBlock($_smarty_tpl, 'Block_739858409660289343a0809_01005100', 'page_title');
?>


<?php 
$_smarty_tpl->inheritance->instanceBlock($_smarty_tpl, 'Block_1322767768660289343a2a29_57114067', 'page_content');
?>

<?php $_smarty_tpl->inheritance->endChild($_smarty_tpl, 'page.tpl');
}
/* {block 'page_title'} */
class Block_739858409660289343a0809_01005100 extends Smarty_Internal_Block
{
public $subBlocks = array (
  'page_title' => 
  array (
    0 => 'Block_739858409660289343a0809_01005100',
  ),
);
public function callBlock(Smarty_Internal_Template $_smarty_tpl) {
?>

  <?php echo call_user_func_array( $_smarty_tpl->smarty->registered_plugins[Smarty::PLUGIN_FUNCTION]['l'][0], array( array('s'=>'Create an account','d'=>'Shop.Theme.Customeraccount'),$_smarty_tpl ) );?>

<?php
}
}
/* {/block 'page_title'} */
/* {block 'register_form_container'} */
class Block_2023204726660289343a3373_91405372 extends Smarty_Internal_Block
{
public function callBlock(Smarty_Internal_Template $_smarty_tpl) {
?>

      <?php echo $_smarty_tpl->tpl_vars['hook_create_account_top']->value;?>

      <section class="register-form">
        <p><?php echo call_user_func_array( $_smarty_tpl->smarty->registered_plugins[Smarty::PLUGIN_FUNCTION]['l'][0], array( array('s'=>'Already have an account?','d'=>'Shop.Theme.Customeraccount'),$_smarty_tpl ) );?>
 <a href="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['urls']->value['pages']['authentication'], ENT_QUOTES, 'UTF-8');?>
"><?php echo call_user_func_array( $_smarty_tpl->smarty->registered_plugins[Smarty::PLUGIN_FUNCTION]['l'][0], array( array('s'=>'Log in instead!','d'=>'Shop.Theme.Customeraccount'),$_smarty_tpl ) );?>
</a></p>
        <?php echo call_user_func_array( $_smarty_tpl->smarty->registered_plugins[Smarty::PLUGIN_FUNCTION]['render'][0], array( array('file'=>'customer/_partials/customer-form.tpl','ui'=>$_smarty_tpl->tpl_vars['register_form']->value),$_smarty_tpl ) );?>

      </section>
    <?php
}
}
/* {/block 'register_form_container'} */
/* {block 'page_content'} */
class Block_1322767768660289343a2a29_57114067 extends Smarty_Internal_Block
{
public $subBlocks = array (
  'page_content' => 
  array (
    0 => 'Block_1322767768660289343a2a29_57114067',
  ),
  'register_form_container' => 
  array (
    0 => 'Block_2023204726660289343a3373_91405372',
  ),
);
public function callBlock(Smarty_Internal_Template $_smarty_tpl) {
?>

    <?php 
$_smarty_tpl->inheritance->instanceBlock($_smarty_tpl, 'Block_2023204726660289343a3373_91405372', 'register_form_container', $this->tplIndex);
?>

<?php
}
}
/* {/block 'page_content'} */
}
