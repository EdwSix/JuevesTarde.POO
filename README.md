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
skinparam packageStyle rectangle

actor Administrador
actor Coordinador
actor Vendedor
actor Cajero
actor "Reloj/Planificador" as Reloj <<Sistema>>
actor "Pasarela de pagos" as Pasarela <<Sistema>>

rectangle "Agencia de Turismo - Rumbo Sur" {
usecase "CU-01: Administrar catálogo" as CU1
usecase "CU-02: Programar salidas" as CU2
usecase "CU-03: Consultar salidas" as CU3
usecase "CU-04: Gestionar estado salida" as CU4
usecase "CU-05: Crear reservas" as CU5
usecase "CU-06: Asignar guía" as CU6
usecase "CU-07: Asignar transporte" as CU7
usecase "CU-08: Registrar clientes" as CU8
usecase "CU-09: Calcular Precio" as CU9
usecase "CU-10: Contratar servicios" as CU10
usecase "CU-11: Registrar seña" as CU11
usecase "CU-12: Registrar pagos del saldo" as CU12
usecase "CU-13: Cancelar reservas" as CU13
usecase "CU-14: Modificar reservas" as CU14
usecase "CU-15: Emitir lista pasajero" as CU15
usecase "CU-16: Liquidar honorarios" as CU16
usecase "CU-17: Emitir reportes" as CU17
}

Administrador --> CU1
Administrador --> CU17

Coordinador --> CU2
Coordinador --> CU3
Coordinador --> CU4
Coordinador --> CU6
Coordinador --> CU7
Coordinador --> CU15
Coordinador --> CU16

Vendedor --> CU5
Vendedor --> CU8
Vendedor --> CU13
Vendedor --> CU14

Cajero --> CU11
Cajero --> CU12
Pasarela -up-> CU11
Pasarela -up-> CU12
Reloj -up-> CU4

' Relaciones de Inclusión y Extensión
CU5 ..> CU8 : <<include>>
CU5 ..> CU9 : <<include>>
CU5 ..> CU11 : <<include>>
CU10 .> CU5 : <<extend>>
CU10 .> CU14 : <<extend>>
CU2 ..> CU6 : <<extend>>
CU2 ..> CU7 : <<extend>>
CU13 ..> CU9 : <<include>>

@enduml