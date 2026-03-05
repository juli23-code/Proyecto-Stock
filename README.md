# Sistema de Gestión de Stock

## Descripción

Este proyecto consiste en el desarrollo de un **sistema de gestión de inventario** implementado en **Java**, cuyo objetivo es administrar productos, registrar movimientos de stock y mantener un historial de transacciones realizadas por los usuarios del sistema.

El sistema permite:

- Gestionar productos dentro de un inventario.
- Registrar **entradas y salidas de stock**.
- Mantener un **historial de transacciones**.
- Controlar los **usuarios que realizan las operaciones**.
- Persistir la información mediante una capa de **Base de Datos**.

El proyecto está diseñado siguiendo principios de **Programación Orientada a Objetos (POO)** y separación de responsabilidades entre las distintas entidades del sistema.

---

# Objetivos del Proyecto

El objetivo principal es construir un sistema que permita:

1. Administrar productos dentro de un inventario.
2. Registrar cada modificación del stock mediante transacciones.
3. Mantener trazabilidad de **qué usuario realizó cada operación**.
4. Centralizar el acceso a datos mediante una capa de persistencia.
5. Modelar correctamente las relaciones entre las entidades del sistema.

---

# Diagrama de Clases

A continuación se presenta el diagrama UML que modela la estructura principal del sistema.

![Diagrama del sistema](CAMBIAR)

---

# Arquitectura del Sistema

El sistema está compuesto por las siguientes entidades principales.

---

## Usuario

Representa a los usuarios que interactúan con el sistema.

### Atributos

- `id`
- `nombreUsuario`
- `contrasena`
- `rol`

### Responsabilidades

- Iniciar sesión en el sistema
- Cerrar sesión
- Realizar operaciones sobre el inventario

### Métodos

```
iniciarSesion()
cerrarSesion()
```

Cada usuario puede realizar múltiples transacciones dentro del sistema.

---

## Producto

Representa los productos almacenados en el inventario.

### Atributos

- `productoId`
- `nombre`
- `descripcion`
- `stockActual`
- `precio`
- `categoria`

### Responsabilidades

- Mantener la información básica del producto.
- Exponer sus detalles cuando son requeridos.

### Métodos

```
obtenerDetalles()
```

Un producto puede verse afectado por múltiples transacciones.

---

## Inventario

La clase **Inventario** es la encargada de gestionar el estado actual del stock.

### Responsabilidades

- Registrar entradas de stock
- Registrar salidas de stock
- Actualizar existencias
- Verificar disponibilidad de productos

### Métodos

```
actualizarExistencias(Producto producto, int cantidad)
registrarEntrada(Producto producto, int cantidad)
registrarSalida(Producto producto, int cantidad)
verificarDisponibilidad(int productoId)
```

El inventario también genera registros de transacciones cada vez que se modifica el stock.

---

## Transacción

Representa un **movimiento de inventario**.

Cada vez que el stock cambia, se genera una transacción que registra:

- qué usuario realizó la operación
- qué producto fue afectado
- qué tipo de movimiento se realizó

### Atributos

- `transaccionId`
- `fechaHora`
- `tipo`
- `cantidadCambio`
- `usuarioId`
- `productoId`

### Métodos

```
guardarRegistro()
```

Las transacciones permiten mantener **historial y trazabilidad del sistema**.

---

## BaseDeDatos

La clase **BaseDeDatos** representa la capa de persistencia del sistema.

Es responsable de:

- conectarse a la base de datos
- recuperar información
- almacenar registros

### Métodos principales

```
conectar()
consultarUsuario(String usuario)
actualizarStock(int productoId, int nuevoStock)
insertarTransaccion(Transaccion transaccion)
obtenerListaProductos()
```

---

# Flujo de funcionamiento

El flujo básico de operación del sistema es el siguiente:

1. Un **usuario inicia sesión**.
2. El usuario accede al **inventario**.
3. Se registra una **entrada o salida de stock**.
4. El inventario **actualiza el producto**.
5. Se genera una **transacción**.
6. La transacción se **almacena en la base de datos**.

Esto permite mantener un registro completo de todas las operaciones realizadas.

---

# Tecnologías

- Java
- Programación Orientada a Objetos (POO)
- UML para modelado del sistema

---

# Posibles mejoras futuras

Algunas extensiones que podrían incorporarse al sistema:

- interfaz gráfica
- API REST
- gestión de proveedores
- sistema de alertas de stock mínimo
- reportes de inventario
- autenticación más robusta
