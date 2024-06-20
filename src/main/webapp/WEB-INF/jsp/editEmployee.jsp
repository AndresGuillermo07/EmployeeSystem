<%@include file="layout/header.jsp"%>
<body>
<%@include file="layout/nav.jsp"%>

<div class="container">
    <div class="text-center" style="margin: 30px">
        <h3>Edit Employee</h3>
    </div>
    <form action="/employees/save" modelAttribute="employeeForm" method="post">

        <input type="hidden" name="idEmployee" value="${employee.idEmployee}">

        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name"
                   name="name" required value="${employee.name}">
        </div>
        <div class="mb-3">
            <label for="departament" class="form-label">Departament</label>
            <input type="text" class="form-control" id="departament" name="departament" value="${employee.departament}">
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">Salary</label>
            <input type="number" step="any" class="form-control" id="salary" name="salary" value="${employee.salary}">
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-warning btn-sm me-3">Save</button>
            <a href="/employees/" class="btn btn-danger btn-sm">Go back</a>
        </div>
    </form>
</div>

<%@include file="layout/footer.jsp"%>
</body>
