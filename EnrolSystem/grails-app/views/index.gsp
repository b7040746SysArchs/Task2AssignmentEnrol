<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolement System | Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Best University In The World.</h1>

<div class="row">
  <asset:image src="main1.fw.png" />
</div>
        <div id="controllers" role="navigation">
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}"></g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
