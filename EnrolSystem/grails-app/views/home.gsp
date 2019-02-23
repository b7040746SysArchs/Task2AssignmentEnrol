<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolement System | Home Page</title>
    <asset:stylesheet src="home.css" />
</head>
<body>

<div id="content" role="main">
  <div class="first">
    <h3>Courses Management</h3>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    <button type="button" class="btn btn-success">
      <g:link controller="course" action="create">Add Course</g:link>
    </button>
    </div>
    <div class="second">
    <h3>Student Enrolement</h3>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    <button type="button" class="btn btn-success">
      <g:link controller="student" action="create">Enrol Student</g:link>
    </button>
  </div>
  <div class="third">
    <h3>Lecturer Management</h3>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    <button type="button" class="btn btn-success">
      <g:link controller="lecturer" action="create">Add Lecturer</g:link>
    </button>
  </div>
  <div class="fourth">
    <h3>Module Management</h3>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    <button type="button" class="btn btn-success">
      <g:link controller="module" action="create">Add Module</g:link>
    </button>
  </div>
</div>

</body>
</html>
