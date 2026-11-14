# Paradigma Orientado a Objetos
Repositorio de; trabajo Práctico de la materia **Paradigma Orientada a Objetos**
del segundo cuatrimestre de 2026

Profesora: Maria Angela LEON

# Integrantes del grupo
|Nombre del alumno| Legajo  |
|--|---------|
|Sixto Calderón, Edwar Manuel | 1200984 |

## Descripción del sistema

Rumbo Sur es una aplicación de consola para administrar tours y sus actividades, programar salidas, asignar guías y vehículos, registrar clientes y reservas, incorporar pasajeros, pagos y servicios adicionales, calcular tarifas y gestionar cancelaciones. La implementación sigue el diagrama UML provisto y está organizada en capas: `modelo`, `repositorio`, `servicio`, `estrategia`, `controlador` y `vista`.

## Requisitos

- JDK 17 o superior instalado.
- Consola de comandos (PowerShell en Windows, Terminal en macOS/Linux).
- No requiere bibliotecas externas ni Maven/Gradle.

## Instrucciones de ejecución

Ubicarse en la carpeta `RumboSur-Etapa2` y compilar las clases:

**Windows PowerShell**

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter '*.java' | ForEach-Object { $_.FullName }
javac -d out $files
java -cp out vista.MenuPrincipal
```

**macOS/Linux**

```bash
mkdir -p out
javac -d out $(find src -name '*.java')
java -cp out vista.MenuPrincipal
```

Para ejecutar las pruebas autocontenidas de reglas de negocio, compilar con los mismos comandos y correr:

```text
java -cp out pruebas.PruebasNegocio
```

La prueba comprueba cálculo de tarifa y saldo, persistencia local, cancelación anticipada y una validación de datos. El menú ofrece una demostración del cálculo de una tarifa.

## Correspondencia con el UML

Se implementan las clases del diagrama: `Tour` abstracta y sus subclases `TourUrbano`, `TourCultural` y `TourNaturaleza`; `Actividad`; `Salida`; `Empleado` abstracta y sus subclases `Conductor` y `Administrador`; `Vehiculo`; `Cliente`; `Reserva`; `Pasajero`; `ServicioAdicional`; `Pago`; `Tarificador`; `EstrategiaPrecio`; `ControlReserva`; `PoliticaCancelacion`; `RepositorioArchivos`; y `LiquidacionGuia`.

Las asociaciones se representan con referencias y colecciones: un tour incluye actividades y programa salidas; una salida tiene guía y vehículo; un cliente realiza reservas; una reserva recibe una salida y contiene pasajeros, pagos y servicios adicionales; un pasajero solicita servicios; y el tarifador calcula importes mediante una estrategia. Las colecciones reflejan las multiplicidades del diagrama. Los atributos y métodos visibles se preservan; constructores y accesores complementarios permiten crear y utilizar los objetos en Java.

## Validaciones y supuestos

- Los campos requeridos no pueden estar vacíos; duración, cupo, capacidad y edad deben ser positivos; importes y precios no pueden ser negativos.
- La reserva controla el cupo de pasajeros y verifica requisitos declarados por las actividades.
- Se supone reembolso total al cancelar con siete o más días de anticipación y sin reembolso en un plazo menor. El UML no define el umbral ni porcentajes, por eso este criterio queda documentado como supuesto.
- La tarifa base es el precio del tour por pasajero; `EstrategiaPrecio` permite reemplazar ese cálculo.
- El UML no modela disponibilidad temporal de guías/vehículos ni configuración de la política; no se agregaron entidades de dominio para cubrir esos datos.
- `RepositorioArchivos` guarda objetos serializados localmente como decisión técnica de persistencia.

