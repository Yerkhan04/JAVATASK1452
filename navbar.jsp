<%--
  Created by IntelliJ IDEA.
  User: Diana
  Date: 01.05.2023
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="head.jsp"%>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: deepskyblue">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">TASK MANAGER</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/home">Home</a>
        </li>
      </ul>
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/addTask">Add Task</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<br>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="/addTask" method="post">
        <div class="modal-body">
          <div class="mt-2 mb-2">
            <label class="form-lable">ИМЯ:</label>
            <input class="form-control" type="text" name="name">
          </div>
          <div class="mt-2 mb-2">
              <label class="form-lable">Описание</label>
              <input type="text" name="description" class="form-control">
          </div>
          <div class="mt-2 mb-2">
            <label class="form-lable">Крайний срок:</label>
            <input class="form-control" type="date" name="data">
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
          <button type="submit" class="btn btn-primary">ADD TASK</button>
        </div>
      </form>
    </div>
  </div>
</div>
</body>
</html>
