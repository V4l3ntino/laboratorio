<?php
/* Smarty version 3.1.43, created on 2024-03-24 19:39:26
  from '/var/www/html/admin251sdqirf/themes/default/template/content.tpl' */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.43',
  'unifunc' => 'content_6600735e6244d7_17964864',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '9186b4e795d8f4c54a88e53387e92e4f73a87ea0' => 
    array (
      0 => '/var/www/html/admin251sdqirf/themes/default/template/content.tpl',
      1 => 1651952840,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_6600735e6244d7_17964864 (Smarty_Internal_Template $_smarty_tpl) {
?><div id="ajax_confirmation" class="alert alert-success hide"></div>
<div id="ajaxBox" style="display:none"></div>

<div class="row">
	<div class="col-lg-12">
		<?php if ((isset($_smarty_tpl->tpl_vars['content']->value))) {?>
			<?php echo $_smarty_tpl->tpl_vars['content']->value;?>

		<?php }?>
	</div>
</div>
<?php }
}
