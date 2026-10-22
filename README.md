# Paradigma Orientado a Objetos
Repositorio de; trabajo Práctico de la materia **Paradigma Orientada a Objetos**
del segundo cuatrimestre de 2026

Profesora: Maria Angela LEON

# Integrantes del grupo
|Nombre del alumno|Legajo|
|--|--|
|Sixto Calderón, Edwar Manuel |1200984|
|Sixto Calderón, Gretell Virginia |1202890|
|Ayala Ocampo, Alan |1196870|

# Sistema de Gestion y Ventas de Tour en una agencia de turismo

> Trabajo Practico Obligatorio . **POO** . UADE

Sistema de gestión y venta de tours de una agencia de turismo por consola (CLI), desarrollado en
JAVA . Maneja usuarios con roles, catálogo de tours, venta de de tours con
selección de asientos y reportes, con persistencia en archivos JSON.

---

## Funcionalidades
<table>
<thead>
<tr>
  <th align="center" valign="middle"><b>Id Rn</b></th>
  <th align="center" valign="middle"><b>Descripción Rn</b></th>
  <th align="center" valign="middle"><b>Id RF</b></th>
  <th align="center" valign="middle"><b>Descripción RF</b></th>
  <th align="center" valign="middle"><b>Id CU</b></th>
  <th align="center" valign="middle"><b>Nombre del caso de Uso</b></th>
</tr>
</thead>
<tbody>
<tr>
  <td align="center" valign="middle" rowspan="6"><b>RN-01</b></td>
  <td align="left" valign="middle" rowspan="6">Hay tres categorías de tour: de aventura, cultural y de naturaleza. La de aventura exige una edad mínima y aclara el nivel de dificultad.</td>
  <td align="center" valign="middle" rowspan="2"><b>RF-01</b></td>
  <td align="center" valign="middle" rowspan="2">El sistema debe permitir registrar un tour con un itinerario compuesto por actividades ordenada por dia , puede ser un dia o de varios , donde cada actividad tiene un tipo (visita, traslado, comida, alojamiento)</td>
  <td align="center" valign="middle"><b>CU-01</b></td>
  <td align="center" valign="middle">Administrar catalogo</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>CU-02</b></td>
  <td align="center" valign="middle">Registrar clientes</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-02</b></td>
  <td align="center" valign="middle">El sistema debe permitir asignar a cada tour: aventura, cultural o naturaleza, no debe requerir edad minima en aventura y cultura</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle" rowspan="2"><b>RF-03</b></td>
  <td align="left" valign="middle" rowspan="2">El sistema debe exigir, para los tours de aventura, el registro de una edad minima y aclara un nivel de dificultad, no debe guardar un tour de aventura ni agregar si no tiene edad mínima</td>
  <td align="center" valign="middle" rowspan="2"></td>
  <td align="center" valign="middle" rowspan="2"></td>
</tr>
<tr>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-04</b></td>
  <td align="left" valign="middle">El sistema debe mostrar la categoria, la edad minima y el nivel de dificultad  al consultar el tour</td>
  <td align="center" valign="middle"><b>CU-03</b></td>
  <td align="center" valign="middle">Modificar reservas</td>
</tr>
<tr>
  <td align="center" valign="middle" rowspan="3"><b>RN-02</b></td>
  <td align="center" valign="middle" rowspan="3">Una salida es una realización concreta de un tour en una fecha, con un cupo máximo, un guía y un vehículo asignados. Estados: programada, confirmada, completa, en curso, finalizada y cancelada.</td>
  <td align="center" valign="middle"><b>RF-05</b></td>
  <td align="center" valign="middle">El sistema debe permitir programar una salida de un tour en una fecha determinada, con un cupo máximo, asignar un guía y un vehículo a una salida, modificar la fecha, el cupo, el guía y el vehículo de una salida mientras no esté en curso, finalizada o cancelada.</td>
  <td align="center" valign="middle"><b>CU-04</b></td>
  <td align="center" valign="middle">Programar salidas</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-06</b></td>
  <td align="center" valign="middle">El sistema debe mostrar, para cada salida, el tour, la fecha, el cupo máximo, los lugares ocupados, los lugares disponibles, el guía, el vehículo y el estado.</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-07</b></td>
  <td align="center" valign="middle">El sistema debe registrar en todo momento el estado de cada salida, que solo puede ser uno de estos: programada, confirmada, completa, en curso, finalizada o cancelada.</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-03</b></td>
  <td align="center" valign="middle">Una salida se confirma cuando alcanza el cupo mínimo. Si 7 días antes de la fecha no lo alcanza, se cancela y se devuelve el 100 % de lo pagado.</td>
  <td align="center" valign="middle"><b>RF-08</b></td>
  <td align="center" valign="middle">El sistema debe permitir la confirmacion de la salida cuando alcance el cupo minimo, de lo contrario si no alcanza el cupo minimo 7 dias antes de la fecha , se cancela , se devuelve el 100% de lo pagado y lo registra</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-04</b></td>
  <td align="center" valign="middle">Cuando se llega al cupo máximo, la salida pasa a «completa» y no admite nuevas reservas</td>
  <td align="center" valign="middle"><b>RF-09</b></td>
  <td align="left" valign="middle">El sistema debe cambiar automáticamente el estado de una salida a completa cuando la suma de lugares ocupados por las reservas vigentes iguala su cupo máximo, y a partir de ese momento debe rechazar la creación de nuevas reservas para esa salida.</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-05</b></td>
  <td align="center" valign="middle">Un guía no puede tener dos salidas superpuestas, y solo puede guiar tours de las categorías para las que está habilitado.</td>
  <td align="center" valign="middle"><b>RF-10</b></td>
  <td align="center" valign="middle">El sistema debe permitir asignar un guía a una salida solo si el guía está habilitado para la categoría del tour y no tiene otra salida cuyo período se superponga con el de la salida a asignar. Si alguna de las dos condiciones falla, debe rechazar la asignación e informar el motivo.</td>
  <td align="center" valign="middle"><b>CU-05</b></td>
  <td align="center" valign="middle">Asignar guia</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-06</b></td>
  <td align="center" valign="middle">La capacidad del vehículo no puede ser menor que el cupo de salida .</td>
  <td align="center" valign="middle"><b>RF-11</b></td>
  <td align="center" valign="middle">El sistema debe permitir asignar un vehículo a una salida sólo si la capacidad del vehículo es mayor o igual al cupo máximo de la salida. Si la capacidad es menor, debe rechazar la asignación e informar el motivo.</td>
  <td align="center" valign="middle"><b>CU-06</b></td>
  <td align="center" valign="middle">Asignar transporte</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-07</b></td>
  <td align="center" valign="middle">Una reserva pertenece a un cliente (el titular) y a una salida, e incluye uno o más pasajeros.</td>
  <td align="center" valign="middle"><b>RF-12</b></td>
  <td align="center" valign="middle">El sistema debe permitir crear una reserva asociada a un único cliente (el titular) y a una única salida, que incluya al menos un pasajero. No debe permitir guardar una reserva sin titular, sin salida o sin pasajeros.</td>
  <td align="center" valign="middle"><b>CU-07</b></td>
  <td align="center" valign="middle">Crear reservas</td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-08</b></td>
  <td align="center" valign="middle">Una reserva con varios pasajeros ocupa tantos lugares del cupo como pasajeros tenga</td>
  <td align="center" valign="middle"><b>RF-13</b></td>
  <td align="center" valign="middle">El sistema descuenta del cupo disponible la cantidad de pasajeros al crear la reserva y valida que haya lugares suficientes antes de aceptarla.</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-09</b></td>
  <td align="center" valign="middle">La tarifa base de un tour depende de la temporada: baja, media o alta.</td>
  <td align="center" valign="middle" rowspan="2"><b>RF-14</b></td>
  <td align="center" valign="middle" rowspan="2">El sistema debe asignar a cada tour una tarifa base que depende de la temporada (baja, media o alta) en la que se realiza el tour y Calcular el precio de cada pasajero a partir de la tarifa base, según su tipo: Adulto 100% de tarifa base, menor de 12 años: 60% de la tarifa base, menor de 3 años no pagan pero deben registrarse</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle" rowspan="2"><b>RN-10</b></td>
  <td align="center" valign="middle" rowspan="2">Cada pasajero paga según su tipo: adulto 100 % de la tarifa, menor de 12 años 60 % y menor de 3 años no paga, pero debe registrarse. Jubilados: 10 % de descuento</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-15</b></td>
  <td align="center" valign="middle">El sistema debe aplicar un 10 % de descuento a los pasajeros jubilados.</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle" rowspan="2"><b>RN-11</b></td>
  <td align="center" valign="middle" rowspan="2">Promociones: «reserva anticipada» (15 % de descuento si se reserva con más de 60 días) y «grupo» (10 % para reservas de 6 o más pasajeros). No se acumulan: se aplica la más favorable al cliente</td>
  <td align="center" valign="middle"><b>RF-16</b></td>
  <td align="center" valign="middle">El sistema debe ofrecer dos promociones: Reservas anticipadas: Reserva realizada con mas de 60 dias  de anticipacion al tour 15% descuento y Grupo: reserva de 6 o mas pasajeros , 10% descuento</td>
  <td align="center" valign="middle"></td>
  <td align="center" valign="middle"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RF-17</b></td>
  <td align="center" valign="middle">Las promociones no se acumulan. Si una reserva califica para más de una, el sistema aplica únicamente la más favorable al cliente (la de mayor descuento). Con los valores actuales, si se cumplen ambas gana reserva anticipada (15 %), pero el sistema debe compararlas por monto y no asumir un orden fijo, por si cambian los porcentajes.</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-12</b></td>
  <td align="center" valign="middle">Los servicios adicionales se suman al precio por pasajero</td>
  <td align="center" valign="middle"><b>RF-18</b></td>
  <td align="center" valign="middle">Los servicios adicionales contratados se suman al precio por pasajero</td>
  <td align="center" valign="middle"><b>CU-08</b></td>
  <td align="center" valign="middle"><b>Contratar servicios</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-13</b></td>
  <td align="center" valign="middle">El seguro de viaje es obligatorio en los tours de aventura.</td>
  <td align="center" valign="middle"><b>RF-19</b></td>
  <td align="center" valign="middle">El sistema debe valida en los tours de aventura el seguro de viaje obligatorio</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-14</b></td>
  <td align="center" valign="middle">Una reserva se confirma al pagar una seña del 30 %. El saldo debe cancelarse hasta 10 días antes de la salida; si no, la reserva se anula y los lugares vuelven al cupo.</td>
  <td align="center" valign="middle"><b>RF-20</b></td>
  <td align="center" valign="middle">El sistema debe confirmar la reserva cuando el cliente pague una seña del 30% del total de las reservas y el saldo restante (70%) debe cancelarse hasta 10 dias antes de la fecha de salida, si el saldo no se acumula en el plazo el sistema anula la reserva y devuelve los lugares al cupo del tour.</td>
  <td align="center" valign="middle"><b>CU-09</b></td>
  <td align="center" valign="middle"><b>Calcular Precio</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-15</b></td>
  <td align="center" valign="middle">Los pagos pueden hacerse en cuotas con distintos medios (efectivo, transferencia, tarjeta).</td>
  <td align="center" valign="middle"><b>RF-21</b></td>
  <td align="center" valign="middle">El sistema debe permitiR distintos medios de pagos(efectivo, transferencia, tarjeta) en una o varias cuotas, cada pago se registra con fecha, monto</td>
  <td align="center" valign="middle"><b>CU-10</b></td>
  <td align="center" valign="middle"><b>Registrar seña</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-16</b></td>
  <td align="center" valign="middle">Pagar con tarjeta en cuotas tiene un recargo del 7 %. Hasta 30 días antes de la salida: devolución del 90 %. Entre 29 y 15 días: 50 %. Entre 14 y 7 días: 20 %. Con menos de 7 días: sin devolución.</td>
  <td align="center" valign="middle" rowspan="2"><b>RF-22</b></td>
  <td align="center" valign="middle" rowspan="2">Si el cliente paga con tarjeta en cuotas, el sistema aplica un recargo del 7 % sobre el monto financiado de esa forma de pago. Los pagos en efectivo, por transferencia o con tarjeta en un solo pago no tienen recargo, Si el cliente cancela, el sistema calcula la devolución según los días que faltan para la salida:30 dias o mas 90%, de 29 a 15 dias 50%, de 14 a 7 dias 20%, menos de 7 dias sin devolucion, si la agencia provoca la cancelacion la devolucion es del 100%</td>
  <td align="center" valign="middle"><b>CU-11</b></td>
  <td align="center" valign="middle"><b>Registrar pagos del saldo</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-17</b></td>
  <td align="center" valign="middle">Si la cancelación la provoca la agencia, la devolución es siempre del 100 %.</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-18</b></td>
  <td align="center" valign="middle">Un pasajero puede ser reemplazado por otro hasta 3 días antes sin cargo, siempre que cumpla las condiciones del tour.</td>
  <td align="center" valign="middle"><b>RF-23</b></td>
  <td align="center" valign="middle">El sistema debe permitir reemplazar a un pasajero de una reserva por otro hasta 3 días antes de la salida, sin cargo, siempre que el reemplazante cumpla las condiciones del tour. El reemplazo no libera el lugar ni lo devuelve al cupo: el lugar se mantiene en la reserva y solo cambian los datos del pasajero.</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-19</b></td>
  <td align="center" valign="middle">Antes de la salida, el coordinador debe emitir la lista de pasajeros con los datos de documento y contacto de emergencia.</td>
  <td align="center" valign="middle" rowspan="2"><b>RF-24</b></td>
  <td align="center" valign="middle" rowspan="2">El sistema permite al coordinador emitir la lista de pasajeros del tour, para cada pasajero, la lista incluye los datos del documento y el contacto de emergencia, si la lista de pasajero no esta emitida o falta un guia asignado, se bloquea el inicio y le indica al coordinador que falta</td>
  <td align="center" valign="middle"><b>CU-12</b></td>
  <td align="center" valign="middle"><b>Emitir lista pasajero</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-20</b></td>
  <td align="center" valign="middle">No se puede iniciar una salida sin esa lista ni sin guía asignado.</td>
  <td align="left" valign="top"></td>
  <td align="left" valign="top"></td>
</tr>
<tr>
  <td align="center" valign="middle" rowspan="2"><b>RN-21</b></td>
  <td align="center" valign="middle" rowspan="2">El guía cobra honorarios por salida finalizada: un monto fijo por día más un 5 % de las ventas de adicionales de esa salida.</td>
  <td align="center" valign="middle" rowspan="2"><b>RF-25</b></td>
  <td align="center" valign="middle" rowspan="2">El sistema debe calcular los honorarios del guía por cada salida finalizada:Un monto fijo por día de la salida.Más un 5 % de las ventas de servicios adicionales de esa salida.Solo se generan honorarios cuando la salida llega al estado “Finalizada”</td>
  <td align="center" valign="middle"><b>CU-13</b></td>
  <td align="center" valign="middle"><b>Liquidar honorariois</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>CU-14</b></td>
  <td align="center" valign="middle"><b>Emitir reportes</b></td>
</tr>
<tr>
  <td align="center" valign="middle"><b>RN-22</b></td>
  <td align="center" valign="middle">Una reserva pagada no se elimina: las correcciones se registran como notas de ajuste</td>
  <td align="center" valign="middle"><b>RF-26</b></td>
  <td align="center" valign="middle">Una reserva con pagos registrados no puede eliminarse. Cualquier corrección se registra como nota de ajuste, que queda vinculada a la reserva y deja trazabilidad.</td>
  <td align="center" valign="middle"><b>CU-15</b></td>
  <td align="center" valign="middle"><b>Cancelar reservas</b></td>
</tr>
</tbody>
</table>                                                                                                                                                                                                                                                                                                                           