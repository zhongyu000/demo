<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>APP开发者平台</title>

  <!-- Bootstrap -->
  <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
  <!-- NProgress -->
  <link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
  <!-- iCheck -->
  <link href="${pageContext.request.contextPath }/statics/css/green.css" rel="stylesheet">
  <!-- bootstrap-progressbar -->
  <link href="${pageContext.request.contextPath }/statics/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
  <!-- JQVMap -->
  <link href="${pageContext.request.contextPath }/statics/css/jqvmap.min.css" rel="stylesheet" />
  <link href="${pageContext.request.contextPath }/statics/css/dropzone.min.css" rel="stylesheet">
  <!-- Custom Theme Style -->
  <link href="${pageContext.request.contextPath }/statics/css/custom.min.css"	rel="stylesheet">

  <!-- add localcss 2016-8-18 -->
  <link href='${pageContext.request.contextPath }/statics/localcss/appinfoadd.css' rel='stylesheet'>
  <link href='${pageContext.request.contextPath }/statics/localcss/appinfolist.css' rel='stylesheet'>
  <style type="text/css">
    body{background-color: wheat;}
    .row{
      margin-top: 70px;
    }
    .x_panel{

      border: 1px solid pink;
      border-radius: 2%;

    }
  </style>
</head>
<div class="clearfix"></div>
<div class="container">
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel"  style="height: 500px">
      <div class="x_title">
        <h2>注册用户信息 <i class="fa fa-user"></i></h2>
        <div class="clearfix"></div>
      </div>
      <div class="x_content">
        <div class="clearfix"></div>
        <form class="form-horizontal form-label-left" action="doregister" method="post">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="devCode">用户编码 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="devCode" class="form-control col-md-7 col-xs-12"
                     data-validate-length-range="20" data-validate-words="1" name="devCode"  required="required"
                     placeholder="请输入用户编码" type="text">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="devName">用户名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="devName" class="form-control col-md-7 col-xs-12"
                     data-validate-length-range="20" data-validate-words="1" name="devName"   required="required"
                     placeholder="请输入用户名称" type="text">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="devPassword">用户密码 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="devPassword" class="form-control col-md-7 col-xs-12"
                     data-validate-length-range="20" data-validate-words="1" name="devPassword"   required="required"
                     placeholder="请输入用户密码" type="password">
            </div>
          </div>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="devEmail">用户邮箱 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="devEmail" class="form-control col-md-7 col-xs-12"
                     data-validate-length-range="20" data-validate-words="1" name="devEmail"   required="required"
                     placeholder="请输入用户邮箱" type="text">
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-6 col-md-offset-5">
              <button id="send" type="submit" class="btn btn-success">保存</button>
              <button type="button" class="btn btn-primary" id="back">返回</button>
              <br/><br/>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
</div>