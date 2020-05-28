<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="会员真实姓名" prop="name">
      <el-input v-model="dataForm.name" placeholder="会员真实姓名"></el-input>
    </el-form-item>
    <el-form-item label="昵称" prop="nickname">
      <el-input v-model="dataForm.nickname" placeholder="昵称"></el-input>
    </el-form-item>
    <el-form-item label="会员密码" prop="password">
      <el-input v-model="dataForm.password" placeholder="会员密码"></el-input>
    </el-form-item>
    <el-form-item label="身份证号" prop="card">
      <el-input v-model="dataForm.card" placeholder="身份证号"></el-input>
    </el-form-item>
    <el-form-item label="手机号" prop="phone">
      <el-input v-model="dataForm.phone" placeholder="手机号"></el-input>
    </el-form-item>
    <el-form-item label="邮箱" prop="email">
      <el-input v-model="dataForm.email" placeholder="邮箱"></el-input>
    </el-form-item>
    <el-form-item label="等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）" prop="level">
      <el-input v-model="dataForm.level" placeholder="等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）"></el-input>
    </el-form-item>
    <el-form-item label="信誉分（默认：600）" prop="credits">
      <el-input v-model="dataForm.credits" placeholder="信誉分（默认：600）"></el-input>
    </el-form-item>
    <el-form-item label="状态（0-正常，1-失效）" prop="status">
      <el-input v-model="dataForm.status" placeholder="状态（0-正常，1-失效）"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="创建时间"></el-input>
    </el-form-item>
    <el-form-item label="修改时间" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder="修改时间"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          name: '',
          nickname: '',
          password: '',
          card: '',
          phone: '',
          email: '',
          level: '',
          credits: '',
          status: '',
          createTime: '',
          updateTime: ''
        },
        dataRule: {
          name: [
            { required: true, message: '会员真实姓名不能为空', trigger: 'blur' }
          ],
          nickname: [
            { required: true, message: '昵称不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '会员密码不能为空', trigger: 'blur' }
          ],
          card: [
            { required: true, message: '身份证号不能为空', trigger: 'blur' }
          ],
          phone: [
            { required: true, message: '手机号不能为空', trigger: 'blur' }
          ],
          email: [
            { required: true, message: '邮箱不能为空', trigger: 'blur' }
          ],
          level: [
            { required: true, message: '等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）不能为空', trigger: 'blur' }
          ],
          credits: [
            { required: true, message: '信誉分（默认：600）不能为空', trigger: 'blur' }
          ],
          status: [
            { required: true, message: '状态（0-正常，1-失效）不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '创建时间不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '修改时间不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/member/member/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.name = data.member.name
                this.dataForm.nickname = data.member.nickname
                this.dataForm.password = data.member.password
                this.dataForm.card = data.member.card
                this.dataForm.phone = data.member.phone
                this.dataForm.email = data.member.email
                this.dataForm.level = data.member.level
                this.dataForm.credits = data.member.credits
                this.dataForm.status = data.member.status
                this.dataForm.createTime = data.member.createTime
                this.dataForm.updateTime = data.member.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/member/member/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'name': this.dataForm.name,
                'nickname': this.dataForm.nickname,
                'password': this.dataForm.password,
                'card': this.dataForm.card,
                'phone': this.dataForm.phone,
                'email': this.dataForm.email,
                'level': this.dataForm.level,
                'credits': this.dataForm.credits,
                'status': this.dataForm.status,
                'createTime': this.dataForm.createTime,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
