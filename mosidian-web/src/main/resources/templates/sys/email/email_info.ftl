<#include "/common/header.ftl">
<style>
	.office-header {
		position: relative;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
		margin-top:35px;
	}
	.email-info {
		font-size: 18px;
	}
	.email-copy {
		outline: none;
		border-color: transparent;
		box-shadow:none;
		color: #fff;
		background-color: #1f8fff;
		width: 60px;
		height: 28px;
		margin-top:15px;
		cursor: pointer;
		border-radius: 40px;
	}
	.email-copy:focus,
	.email-copy:active:focus,
	.email-copy.active:focus,
	.email-copy.focus,
	.email-copy:active.focus,
	.email-copy.active.focus {
		outline: none;
		border-color: transparent;
		box-shadow:none;
	}
	#input {position: absolute;top: 0;left: 0;opacity: 0;z-index: -10;}
</style>
<body>
    <div class="container-fluid container-bg office-efficiency-index">
		<#if id == 1>
			<div class="row  office-header">
				<span class="email-info" id="text">1471128199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		<#elseif id == 2 >
			<div class="row  office-header">
			<span class="email-info" id="text">1471328199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		<#elseif id == 3>
			<div class="row  office-header">
				<span class="email-info" id="text">1471458199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		<#elseif id == 4>
			<div class="row  office-header">
				<span class="email-info" id="text">1471348199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		<#elseif id == 5>
			<div class="row  office-header">
				<span class="email-info" id="text">1471568199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		<#elseif id == 6>
			<div class="row  office-header">
				<span class="email-info" id="text">14711788199@qq.com</span>
				<textarea id="input"></textarea>
				<button class="email-copy" onclick="copyText()">复制</button>
			</div>
		</#if>
    </div>
    <!--特效动画效果-->
</body>
<#include "/common/footer.ftl">
<script>
	function copyText() {
		var text = document.getElementById("text").innerText;
		var input = document.getElementById("input");
		input.value = text; // 修改文本框的内容
		input.select(); // 选中文本
		document.execCommand("copy"); // 执行浏览器复制命令
		var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
		parent.layer.close(index); //再执行关闭
	}
</script>
