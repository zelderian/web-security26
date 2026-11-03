# web-security26
Java 25, Spring Boot 4.1, MongoDB (Docker)

## Run
1. `docker compose up -d`
2. Open the folder in IntelliJ IDEA, wait for Maven import, run `WebSecurity26Application`
   (or `mvn spring-boot:run`)
3. Open a file from `http/` and click Run All Requests in File.

## Labs
- Lab 1: Item CRUD at /api/v1/items
- Lab 2: http/lab2-crud.http
- Lab 3: app.csrf.enabled=false, http/lab3-basic-authorization.http (admin/admin)
- Lab 4: app.csrf.enabled=true, http/lab4-csrf.http + auditing (createdBy, createdDate, ...)
