<?php

use Symfony\Component\DependencyInjection\Argument\RewindableGenerator;

// This file has been auto-generated by the Symfony Dependency Injection Component for internal use.
// Returns the public 'prestashop.adapter.order.command_handler.duplicate_order_cart_handler' shared service.

return $this->services['prestashop.adapter.order.command_handler.duplicate_order_cart_handler'] = new \PrestaShop\PrestaShop\Adapter\Order\CommandHandler\DuplicateOrderCartHandler(${($_ = isset($this->services['prestashop.adapter.context_state_manager']) ? $this->services['prestashop.adapter.context_state_manager'] : $this->load('getPrestashop_Adapter_ContextStateManagerService.php')) && false ?: '_'});
