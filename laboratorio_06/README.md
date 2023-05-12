# Preguntas

## Labo 6

### ¿En qué consiste el patrón de diseño Repository?

El patrón de diseño Repository es una técnica de arquitectura de software que se utiliza para separar la lógica de almacenamiento de datos de la lógica de negocio en una aplicación. Consiste en crear una capa intermedia entre la capa de datos y la capa de negocio, que proporciona una interfaz unificada para acceder a los datos y oculta los detalles de implementación subyacentes. Esto mejora la modularidad, el mantenimiento y la escalabilidad de la aplicación al facilitar el cambio de la fuente de datos subyacente sin afectar la lógica de negocio.

### ¿Qué es el ViewModel?

El ViewModel es un componente de arquitectura de Android que se utiliza para almacenar y administrar datos relacionados con la interfaz de usuario y que sobrevive a los cambios de configuración de la aplicación, como rotaciones de pantalla. Ayuda a separar la lógica de la interfaz de usuario del resto de la aplicación y mejora la escalabilidad y la facilidad de prueba de la aplicación.

## Labo 7

### ¿Qué ventajas tiene el utilizar LiveData?

- Actualización automática de la interfaz de usuario
- Prevención de errores de memoria
- Optimización de recursos
- Fácil integración con otros componentes de Android

### ¿Qué patrón de diseño utiliza LiveData?

LiveData utiliza el patrón de diseño "Observer" (también conocido como "Observable"). En el patrón Observer, un objeto (el "sujeto") mantiene una lista de sus observadores y notifica automáticamente a todos los observadores cuando cambia su estado. En el caso de LiveData, el objeto LiveData actúa como el "sujeto" y los componentes de la interfaz de usuario, como actividades y fragmentos, actúan como los "observadores". Cuando los datos dentro del LiveData cambian, LiveData notifica automáticamente a los observadores para que puedan actualizar su interfaz de usuario.

### ¿Qué se debe agregar al Gradle para poder implementar DataBinding?

En el archivo build.gradle de nivel de aplicación: agregar "dataBinding { enabled = true }" en el bloque "android".

### ¿Qué es DataBinding? Menciona sus ventajas frente a findViewById.

Data Binding es una función de Android que permite vincular directamente las vistas de una interfaz de usuario con los datos del modelo de la aplicación.
Ventajas frente a findViewById: Simplificación del código, mayor seguridad, mejora del rendimiento y facilita la creación de diseños complejos.

## Labo 8
### ¿Cuál es la principal ventaja de utilizar Recycler View?

La principal ventaja de utilizar RecyclerView es que permite la creación de listas de elementos de forma dinámica, es decir, que se pueden agregar o eliminar elementos de la lista en tiempo de ejecución.

### Menciona los componentes de RecyclerView y la función que tiene cada uno de ellos

- RecyclerView: Es el contenedor que se encarga de mostrar los elementos de la lista.
- LayoutManager: Es el encargado de posicionar los elementos de la lista.
- Adapter: Es el encargado de crear los elementos de la lista.
- ViewHolder: Es el encargado de mantener las referencias de los elementos de la lista.