# Paradigma Orientado a Objetos
Repositorio de; trabajo Práctico de la materia **Paradigma Orientada a Objetos**
del segundo cuatrimestre de 2026

Profesora: Maria Angela LEON

# Integrantes del grupo
|Nombre del alumno| Legajo  |
|--|---------|
|Sixto Calderón, Edwar Manuel | 1200984 |
|Sixto Calderón, Gretell Virginia | 1202890 |
|Ayala Ocampo, Alan | 1196870 |

# Diagramas de Casos de Uso
@startuml
left to right direction

' Definición de actores
actor Administrador
actor Coordinador
actor Vendedor
actor Cliente
actor "Administración" as Administracion
actor Planificador
actor Guía

' Límite del sistema y casos de uso
rectangle "Sistema de gestión - Agencia Rumbo Sur " {
usecase "CU-01 Gestionar catálogo" as CU1
usecase "CU-02 Programar salida" as CU2
usecase "CU-03 Registrar cliente" as CU3
usecase "CU-04 Crear reserva" as CU4
usecase "CU-05 Calcular precio" as CU5
usecase "CU-06 Registrar pagos" as CU6
usecase "CU-07 Contratar adicionales" as CU7
usecase "CU-08 Modificar/cancelar reserva" as CU8
usecase "CU-09 Asignar guía y vehículo" as CU9
usecase "CU-10 Emitir lista de pasajeros" as CU10
usecase "CU-11 Cerrar salida" as CU11
usecase "CU-12 Liquidar honorarios" as CU12
usecase "CU-13 Emitir reportes" as CU13
usecase "CU-14 Controlar cupo mínimo" as CU14
usecase "CU-15 Anular por saldo impago" as CU15
usecase "CU-16 Reemplazar pasajero" as CU16
usecase "CU-17 Consultar itinerario" as CU17
}

' Relaciones de Administrador
Administrador -- CU1
Administrador -- CU6
Administrador -- CU12
Administrador -- CU13

' Relaciones de Coordinador
Coordinador -- CU2
Coordinador -- CU9
Coordinador -- CU10
Coordinador -- CU11
Coordinador -- CU12

' Relaciones de Vendedor
Vendedor -- CU3
Vendedor -- CU4
Vendedor -- CU6
Vendedor -- CU7
Vendedor -- CU8
Vendedor -- CU16

' Relaciones de Cliente
Cliente -- CU4
Cliente -- CU7
Cliente -- CU8
Cliente -- CU16
Cliente -- CU17

' Relaciones de Planificador
Planificador -- CU14
Planificador -- CU15

' Relaciones de Guía
Guía -- CU17

' Relaciones de Inclusión (Include)
CU4 ..> CU5 : <<include>>

@enduml