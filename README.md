# Interfaz para Android
Creación de una interfaz para Android con MVC

### Requisitos

-Android Studio

### MVC en Android Studio

**¿Qué es MVC?** *Es un patrón de diseño*, MVC(modelo – vista – controlador) basado principalmente en la separación de intereses: 

- **Modelo**: *contiene la información con la que el sistema trabaja*, esta información se le proporciona a la vista para que esta pueda mostrarla y permite así realizar cambios en el controlador. 
- **Controlador**: *responde a las acciones del usuario*, modificando el modelo cuando sea necesario, además se comunica constantemente con la vista para que se actualice con los últimos cambios del modelo. 
- **Vista**: *proporciona al usuario información del modelo*. 

Con este patrón de diseño se propone la **modularidad**, ya que el programador divide su aplicación en varios módulos diferentes, esto ayuda a disminuir el grado de dificultad del problema al que da respuesta el programa, además que facilita la comprensión del programa. 

El usuario interactúa con la interfaz de usuario, el controlador recibe la información de la vista-interfaz y accede al modelo, lo actualiza y modifica con la información que recibió, se realiza el proceso lógico y la vista obtiene sus datos del modelo para generar una interfaz para el usuario, la interfaz de usuario espera nuevas instrucciones por parte del usuario y comienza el ciclo nuevamente. 

*Principales errores al utilizar este patrón de arquitectura en Android:*

  **o**	Hacer el código dependiente 
  
  **o**	No definir los controladores y modelos como clases separadas 

**¿Dónde están las vistas, modelos y controladores en el desarrollo Android?**

**Vistas**: *Layout*, estos archivos los podemos encontrar en la carpeta de recursos de nuestro proyecto, esta carpeta se llama *res*, aquí podemos encontrar todos los recursos, los dibujos, los String, los layout, entre otros. *En la carpeta res únicamente vamos a guardar archivos XML* que básicamente es donde encontraremos las vistas de la pantalla.

**Nota importante:** En este directorio se pueden encontrar temples que básicamente son plantillas, estas son muy útiles al momento de trabajar con otras tecnologías como Angular.

Las vistas nos van a servir para representar varios objetos que se encuentran en los modelos 

**Modelos**: estos no los podemos encontrar explícitamente en los archivos por defecto del proyecto, estos debemos de crearlo

**Controlador**: En este caso usaremos algo ya existente llamado mainactivity.

## Tutorial 

### Nuevo proyecto
1.Abrimos Android Studio 
  - Si es la primera vez que usamos la aplicación creamos un nuevo proyecto. 
  - Si no es la primera vez, cerramos nuestro proyecto actual y creamos uno nuevo. 

2.Al crear un nuevo proyecto nos aparecerá la siguiente ventana 

Debemos elegir el estilo de nuestra aplicación, existen diferentes estilos para las diferentes aplicaciones que desees crear, para este tutorial seleccionaremos **Empety Activity** 

3.Ahora nos aparecerá la configuración de nuestro proyecto 
  - Primero nos pedirá un nombre para el proyecto, puede ser cualquier nombre.
  - Automáticamente se escribe el Package del proyecto una vez que le escribamos el nombre.
  - Luego nos pide la ruta en donde se guardará el proyecto, en la imagen es un ejemplo de ruta que viene por defecto.
  - Posteriormente nos pedirá el lenguaje en el que estará la aplicación, puede ser JAVA o Kotlin (https://developer.android.com/kotlin?hl=es-419), en este tutorial usaremos JAVA.
  - Por último debemos elegir el mínimo SDK que se necesita para que nuestra aplicación funcione, se recomienda utilizar el API 21 que pertenece al Android 5.0, pero si quieres elegir otra o saber mas sobre la API, seleccionas **Help me choose**, y te aparecerá la siguiente ventana.

    Aquí se te describe más a detalle la información de la API, selecciona la que mas te convenga, para     el tutorial usaremos la 5.0 
  - Seleccionamos Finish.
  
4.El proyecto se ha creado. 

5.Podemos ver que por defecto ya tenemos el controlador que es el MainActivity, ahora corresponde crear el modelo y la vista, primero creamos la vista: 

**i.** Nos vamos a la carpeta *res* que ya se menciono anteriormente
**ii.** Hacemos clic en la carpeta llamada *layout*, por defecto ya debe contener un archivo llamado *activity_main.xml*
**iii.** Crearemos un nuevo archivo *.xml* llamado y con un clic derecho 

6.Creamos los modelos, para hacerlo se deben de seguir los siguientes pasos:

**i.**	Nos ubicamos en la carpeta src en donde se encuentra todo el código fuente, como el MAINACTIVITY, justo en el paquete llamado **com.example.(nombre del proyecto)**, hacemos clic derecho y creamos un nuevo package llamado Modelo

**ii.**	Una vez en esta carpeta creamos un package llamado Modelo aquí guardaremos todos los modelos que necesitemos para nuestro proyecto, es muy importante crear el directorio para tener un código más organizado. 

**iii.** Dentro del nuevo paquete llamado Modelo, creamos una nueva clase donde guardaremos para esta ocacion los objetos del usuario. 

**iv.**	Ahora creamos una clase que llamaremoso *UsuarioModelo.class* en donde se encontrarán los objetos que se mostraran en la vista

7.Ya tenemos creada la clase, para este ejemplo vamos a crear un `String nombre` aqui guardaremos el nombre del usuario

8. Creamos el constructor `public UsuarioModelo(){ }`

9.Creamos un *set* que reciba el nombre  `public void setNombre(String nombre) {
        this.nombre = nombre;
    }`

10.Creamos un *get* que devuela el nombre del usuario `public String getNombre() {
        return nombre;
    }`

11.En el controlador *MainActivity*, debemos tener una forma de adquirir la información y mostrarlo en la vista, para hacer esto primero modifiquemos nuestro archivo *.xml*, en este tutorial modificaremos el archivo *activity_main.xml* pero se pueden hacer nuevos archivos para tener mas vistas. Este archvivo lo puedes localizar en la carpeta *res* en el directorio de *layout* 

12.En el *activity_main.xml* localizamos la etiqueta `<TextView` en esa etiqueta agregamos la siguiente linea `android:id="@+id/txv1"`

13.Copiamos el *TextView* y lo pegamos debajo del que viene por defecto, le cambiamos la siguiente linea `android:id="@+id/txv1"` por `android:id="@+id/txv2"` y tambien cambiamos la linea `android:text="Hello World!"` por `android:text="Usuario"` 

14.Arrbiba entontramos los botones *Code, Split y Desing* seleccionamos *Split* o *Desing* y acomodamos los cuadros de texto, para que no esten juntos.

14.Por devecto en la vista aparece un `Hello Word` pero en el controlador **MainActivity.java** puedo cambiar su contenido, agregamos `TextView text1 = (TextView)findViewById(R.id.txv1);
        text1.setText("Hola");` en el *MainActivity* enviará una nueva información a la vista.  
 
15.Agregamos otra linea ` UsuarioModelo usuario = new UsuarioModelo();
        usuario.setNombre("Fulanito");`en el *MainActivity* aqui creamos un nuevo objeto de tipo *Usuario*

16.Enviamos el objeto nuevo a la vista `TextView textusuario = (TextView)findViewById(R.id.txv2);
        textusuario.setText(usuario.getNombre());`

17.Corremos la aplicacion, podemos apretar en el icono de una flecha verde donde automaticamente se abre un dispositivo virtual.
