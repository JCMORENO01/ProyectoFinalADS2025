#  Sistema de Gestión de Emergencias Hospitalarias

Este proyecto es un sistema de gestión para emergencias médicas en hospitales, que permite registrar pacientes, asignar médicos, manejar signos vitales, órdenes médicas, y administrar recursos hospitalarios como camillas y equipos médicos.

---

##  Características Principales

- Registro y gestión de pacientes.
- Asignación automática de médicos.
- Registro y monitoreo de signos vitales.
- Generación y administración de órdenes médicas.
- Control de estado de camillas y equipos médicos.
- Notificaciones automáticas a médicos ante signos vitales críticos.
- Gestión de resultados de laboratorio.

---

## Tecnologías Usadas

- **Java 8+**
- **Maven** (gestión de dependencias)
- **JUnit 5** (pruebas unitarias y de integración)

---

##  Patrones de Diseño Aplicados

| Patrón        | Implementación                               |
|:-------------:|:---------------------------------------------|
| **Facade**    | `HospitalFacade` simplifica las operaciones del sistema. |
| **Builder**   | `PacienteBuilder` para la creación flexible de pacientes. |
| **Observer**  | `NotificadorSignosVitales` y `MedicoConcreto` para alertas automáticas. |

---

##  Estructura del Proyecto

```bash
ProyectoFinalADS/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── app/
│   │       ├── facade/
│   │       ├── historia/
│   │       ├── laboratorio/
│   │       ├── medicos/
│   │       ├── notificaciones/
│   │       ├── ordenes/
│   │       ├── pacientes/

```
Creado por:
- Juan David Ortiz
- Juan Camilo Moreno
- Luna Rengifo
- Samuel Nemes

