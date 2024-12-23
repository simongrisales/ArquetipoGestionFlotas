# Sistema de Gestión de Flotas Inteligente

## Descripción del Proyecto

Este proyecto tiene como objetivo gestionar flotas de vehículos inteligentes, para que las empresas puedan optimizar 
sus operaciones y mejorar la eficiencia en la gestión. La idea es poder realizar un seguimiento en tiempo real, 
optimizar las rutas, hacer mantenimiento predictivo y gestionar los conductores, todo con integración de servicios 
externos como proveedores de mapas y servicios de mantenimiento.

### Funcionalidades Principales:

- **Seguimiento en tiempo real**: Seguimiento en tiempo real: Los administradores podrán ver la ubicación, velocidad 
y el estado de cada vehículo.
- **Rutas inteligentes**: El sistema calculará las mejores rutas teniendo en cuenta el tráfico, el clima y otros 
factores.
- **Mantenimiento predictivo**: Al recoger datos de los vehículos, se generarán alertas para realizar mantenimientos 
preventivos.
- **Gestión de conductores**: Los conductores serán asignados a los vehículos y se podrá monitorear su desempeño.
- **Integración con terceros**: Se integrarán servicios como mapas en tiempo real o proveedores de mantenimiento.

## Estilo Arquitectónico

### Microservicios
- Aunque el monolito es adecuado para el MVP del proyecto, elegí los microservicios porque ofrecen mayor flexibilidad 
a medida que el sistema crece. Como el proyecto tiene que soportar miles de vehículos y miles de consultas a la vez, 
fácilmente se podría trabajar con este estilo, también porque se puede trabajar de manera independiente y tiene un 
mantenimiento fácil.

## Trade-offs
Con este enfoque logré encontrar estos trade-offs:
- Rapidez en su elaboración *vs* Escalabilidad a largo plazo.
- Facilidad para coordinar cambios *vs* Dependencia entre módulos.
- Flexibilidad para aplicar cambios rápidos *vs* Riesgo de colapso de todo el sistema.
- Seguridad en la privacidad *vs* Riesgo de un ataque masivo.
- Estructura ordenada del código *vs* Tiempo de desarrollo de interfaces de usuario.
- Facilidad para añadir nuevas funcionalidades *vs* Complejidad al escalar el sistema.
- Fácil de depurar *vs* Problemas de comunicación entre microservicios.
- Velocidad para la interacción de datos *vs* Escalabilidad con más usuarios.
- Bajo presupuesto inicial *vs* Requiere más inversión a largo plazo.

## Estructura del Proyecto

### Tecnologías Propuestas
- **Backend:** Java debido a su robustez y por su alto soporte de bibliotecas.
- **Frontend:** HTML, CSS, Bootstrap para un diseño simple y funcional.
- **Frameworks y librerias:** Spring Boot por utilizar el patrón MVC, Spring Data JPA para interactuar con bases de 
datos relacionales, Spring Security para la protección de datos personales.
- **Base de Datos:** MySQL, con tablas para conductores, vehículos y registros de ubicación.
- **Documentación:** Markdown Para la documentación técnica del proyecto, ya que es ligero, fácil de leer y ampliamente 
utilizado en proyectos de software.

### Estructura de Carpetas
`src/
    models/
      Vehiculo.java 
      Conductor.java
    views/
      VehiculoView.java
      ConductorView.java
    controllers/
      VehiculoController.java
      ConductorController.java
    Main.java`

### Explicación de Componentes:

**Modelos (models)**:
- Contienen las clases que representan los objetos principales del proyecto, como `Vehiculo` y `Conductor`.

**Vistas (views)**:
- Se encargan de presentar la información al usuario de forma sencilla, como por ejemplo mostrando los detalles de un 
vehículo o conductor en la consola.

**Controladores (controllers)**:
- Gestionan la lógica de negocio, tomando las decisiones sobre cómo los datos deben ser procesados y presentados 
al usuario.

**Main.java**:
- Este archivo será el punto de entrada del sistema, donde se crean los objetos y se vinculan los controladores con 
los modelos y vistas.

## Patrones de Diseño

- **MVC (Modelo-Vista-Controlador)**: Este patrón se ha elegido porque permite separar claramente las responsabilidades 
de la lógica de negocio, la presentación de datos y el control del flujo. Esto facilita el mantenimiento y la 
escalabilidad del sistema, permitiendo una evolución más ordenada.