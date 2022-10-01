# simple Rest Api with MySQL 

---
edit application.properties and edit the params for connect MySQL 

---
path = api/v1/nutrinet/cliente

methods:
POST:
```json
{
  "nombre":"juanito",
  "apellidos":"perez hernandes",
  "nombre_Usuario":"Ju",
  "correo_Electronico": "juanito@gmail.com",
  "password": "juanito123"
}
```
Response: 200
```json
{
    "edad": 0,
    "geb": 0.0,
    "estatura": 0.0,
    "peso": 0.0,
    "password": "juanito123",
    "nombre": "juanito",
    "apellidos": "perez hernandes",
    "correo_Electronico": "juanito@gmail.com",
    "imc": 0.0,
    "eta": 0.0,
    "fecha_Creacion": null,
    "cliente_ID": 1,
    "nombre_Usuario": "Car"
}
```
---
Get:
with params api/v1/nutrinet/cliente?id=1
```json
{
  ....user
}
```
without params:
```json
[
  {
    "edad": 0,
    "geb": 0.0,
    "estatura": 0.0,
    "peso": 0.0,
    "password": "juanito123",
    "nombre": "juanito",
    "apellidos": "perez hernandes",
    "correo_Electronico": "juanito@gmail.com",
    "imc": 0.0,
    "eta": 0.0,
    "fecha_Creacion": null,
    "cliente_ID": 1,
    "nombre_Usuario": "Car"
  },
  {....user},
  {....user}
]
```
---

PUT:

with params api/v1/nutrinet/cliente?id=1 and body

```json
{
  "edad": 39,
  "estatura": 1.80,
  "peso": 60,
  "geb": 1500
}
```
Response:
```json
  {
    "edad": 39,
    "geb": 1500,
    "estatura": 1.8,
    "peso": 60.0,
    "password": "juanito123",
    "nombre": "juanito",
    "apellidos": "perez hernandes",
    "correo_Electronico": "juanito@gmail.com",
    "imc": 0.0,
    "eta": 0.0,
    "fecha_Creacion": null,
    "cliente_ID": 1,
    "nombre_Usuario": "Car"
  }

```
---

check swagger for more information:
http://localhost:8080/swagger-ui.html