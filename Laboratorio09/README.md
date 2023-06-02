# Preguntas

### ¿Qué es una coroutine en Kotlin y cómo se diferencia de un hilo tradicional?
Una coroutine en Kotlin es una forma ligera y eficiente de realizar tareas asíncronas. A diferencia de un hilo tradicional, una coroutine no está asociada directamente con un hilo de ejecución específico. En cambio, las coroutines pueden ejecutarse en un conjunto limitado de hilos, lo que permite una mejor administración de recursos.

### ¿Cuál es la importancia de la suspensión en las coroutines y cómo se implementa?

La suspensión es una característica fundamental en las coroutines, ya que permite pausar temporalmente la ejecución de una coroutine sin bloquear el hilo subyacente. Esto es importante porque evita que se desperdicien recursos valiosos, como hilos, mientras se espera a que ocurra algún evento, como una operación de entrada/salida o una respuesta de red. La suspensión se implementa utilizando funciones o constructores especiales llamados "puntos de suspensión" o "suspend functions".

### ¿Cuál es el propósito del Dispatcher en las coroutines y cómo se elige uno adecuado para cada tarea?

El Dispatcher en las coroutines de Kotlin es responsable de determinar en qué hilo o hilo de ejecución se ejecutará una coroutine. Es importante elegir un Dispatcher adecuado para cada tarea, ya que esto afecta el rendimiento, la concurrencia y la utilización de recursos. Los Dispatchers predefinidos en Kotlin, como Default, IO y Main, permiten asignar coroutines a hilos específicos según la naturaleza de la tarea, como operaciones de CPU intensivas, operaciones de entrada/salida o actualizaciones de la interfaz de usuario.

### ¿Cuál es el propósito y el uso de la función async en las coroutines?

La función async en las coroutines de Kotlin se utiliza para iniciar una nueva coroutine que devuelve un objeto Deferred, el cual representa un valor que se calculará en el futuro. El propósito de async es permitir la ejecución concurrente de múltiples tareas y obtener resultados asincrónicos de manera eficiente. Se combina con la función await para obtener el resultado de la coroutine y esperar a que la tarea se complete. Al utilizar async y await, se puede ejecutar tareas en paralelo y obtener los resultados a medida que están listos, mejorando así el rendimiento y aprovechando la concurrencia de manera eficiente.
