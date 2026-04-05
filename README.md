# Desbloqueo de Pantalla
Esta aplicación Android implementa un **BroadcastReceiver** que escucha el evento del sistema correspondiente al **desbloqueo de la pantalla** (`Intent.ACTION_USER_PRESENT`).  

Cuando el usuario desbloquea la pantalla, la aplicación realiza lo siguiente:

- Muestra un **Toast** con el mensaje:  
  `"Pantalla desbloqueada detectada"`.
- Registra en **Logcat** un mensaje indicando que se produjo el evento:  
  `"Se detectó desbloqueo de pantalla"`.
- Genera un **Intent implícito** para abrir la aplicación de llamadas con el número seteado.  
  - Se utiliza `ACTION_DIAL` para abrir el marcador sin necesidad de permisos adicionales.
  - 
## Funcionamiento

1. Ejecutar la aplicación en un dispositivo real o emulador.  
2. Bloquear la pantalla del dispositivo.  
3. Desbloquear manualmente la pantalla.  
4. Observar que se dispara el BroadcastReceiver:  
   - Aparece un **Toast**.  
   - Se registra un mensaje en **Logcat**.  
   - Se abre el marcador con el número predefinido.
   - 
## Estructura del Proyecto

- **MainActivity.java**: Activity principal de la aplicación.  
- **DesbloqueoApp.java**: BroadcastReceiver que maneja el evento de desbloqueo.  
- **AndroidManifest.xml**: Declaración del receiver y permisos necesarios.  
- **activity_main.xml**: Layout simple para MainActivity.


