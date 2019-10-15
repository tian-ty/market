<template>
	<el-container>
	  <el-header></el-header>
	  <el-container>
	  <el-aside width="750px"></el-aside>
	  <el-main>
		  <!-- <el-radio-group v-model="labelPosition" size="small">
		    <el-radio-button label="left">左对齐</el-radio-button>
		    <el-radio-button label="right">右对齐</el-radio-button>
		    <el-radio-button label="top">顶部对齐</el-radio-button>
		  </el-radio-group> -->
		  <div style="margin: 20px;"></div>
		  <el-form :label-position="labelPosition" label-width="80px" :model="formLabelAlign">
		    <el-form-item label="用户名:">
		      <el-input v-model="formLabelAlign.username" placeholder="请输入用户名"></el-input>
		    </el-form-item>
		    <el-form-item label="密码:">
		      <el-input v-model="formLabelAlign.password" placeholder="请输入密码"></el-input>
		    </el-form-item>
			<el-form-item>
			  <el-button type="primary">登录</el-button>
			</el-form-item>
		  </el-form>
	  </el-main>
	  <el-aside width="750px"></el-aside>
	  </el-container>
	  <el-footer></el-footer>
	</el-container>
</template>

<script>
    export default {
      data() {
        return {
          labelPosition: 'left',
          formLabelAlign: {
          username: '',
		  password: ''
		 }
	  };
  }
}
</script>

<style>
</style>
