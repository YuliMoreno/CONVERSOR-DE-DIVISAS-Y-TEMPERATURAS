<h1 align="center"> Conversor de Divisas y Temperaturas </h1>

![imagen inicial del proyecto](https://github.com/user-attachments/assets/aef1bff8-af13-407c-8934-96f82f958f4b)

![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)
![Java](https://img.shields.io/badge/java-v11.0.11-blue.svg)
![Maven](https://img.shields.io/badge/maven-v3.8.1-blue.svg)
![License](https://img.shields.io/badge/license-MIT-brightgreen.svg)
![Issues](https://img.shields.io/github/issues/YuliMoreno/CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS.svg)
![Forks](https://img.shields.io/github/forks/YuliMoreno/CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS.svg)
![Stars](https://img.shields.io/github/stars/YuliMoreno/CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS.svg)

## Descripción
Es un proyecto de conversión de divisas y temperaturas desarrollado en Java, utilizando la API de ExchangeRate para obtener 
las tasas de cambio actualizadas. El programa permite a los usuarios convertir entre diversas monedas y unidades de temperatura.

## Estado del Proyecto

Proyecto completado.

## Características 

- **Conversión de Divisas**: Conversión entre múltiples monedas, incluyendo USD, EUR y COP, con tasas de cambio en tiempo real.
- **Conversión de Temperaturas**: Conversión precisa entre Celsius, Fahrenheit y Kelvin.
- **Interfaz de Usuario Interactiva**: Menú fácil de usar para seleccionar conversiones y realizar cálculos.
- **Extensibilidad**: Arquitectura modular que permite agregar nuevas características fácilmente.

## Uso

A continuación se detallan los pasos para utilizar la aplicación de conversión de divisas y temperaturas:

1. **Ejecutar el Programa**:
   - Abre tu terminal o la consola de tu IDE (por ejemplo, IntelliJ IDEA).
   - Navega al directorio donde se encuentra el archivo `Principal.java`.
   - Ejecuta el siguiente comando:
     ```bash
     java Principal
     ```

2. **Seleccionar la Opción de Conversión**:
   - Al iniciar la aplicación, se presentará un menú con las opciones disponibles:
     ```
     1. Convertir Divisas
     2. Convertir Temperaturas
     3. Salir
     ```

3. **Convertir Divisas**:
   - Selecciona la opción de convertir divisas ingresando el número correspondiente (1).
   - Ingresa la cantidad que deseas convertir.
   - Elige la moneda de origen y la moneda de destino de una lista de opciones disponibles (por ejemplo, USD, EUR, COP).
   - La aplicación mostrará el resultado de la conversión.
   - Te dará la opción de realizar otra conversión de divisas o regresar al menú principal.

4. **Convertir Temperaturas**:
   - Selecciona la opción de convertir temperaturas ingresando el número correspondiente (2).
   - Ingresa la temperatura que deseas convertir.
   - Selecciona la unidad de origen (Celsius, Fahrenheit o Kelvin) y la unidad de destino.
   - La aplicación mostrará el resultado de la conversión.
   - Te dará la opción de realizar otra conversión de temperatura o regresar al menú principal.

5. **Salir**:
   - Para salir de la aplicación, selecciona la opción correspondiente (3) en el menú principal.

## Instalación

Sigue los pasos a continuación para instalar y ejecutar la aplicación de conversión de divisas y temperaturas:

### Requisitos Previos

- **Java JDK**: Asegúrate de tener Java Development Kit (JDK) instalado en tu sistema. 
- **IDE**: Es recomendable utilizar un entorno de desarrollo integrado (IDE) como [IntelliJ IDEA](https://www.jetbrains.com/idea/) o
  [Eclipse](https://www.eclipse.org/), pero puedes utilizar cualquier editor de texto que prefieras.

### Pasos de Instalación

1. **Clonar el Repositorio**:
   - Abre una terminal y clona el repositorio usando el siguiente comando:
     ```bash
     git clone https://github.com/YuliMoreno/CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS.git
     ```
   - Reemplaza `YuliMoreno` y `CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS` con tu nombre de usuario y el nombre de tu repositorio.

2. **Navegar al Directorio del Proyecto**:
   - Cambia al directorio del proyecto clonado:
     ```bash
     cd CONVERSOR-DE-DIVISAS-Y-TEMPERATURAS
     ```

3. **Configurar las Dependencias**:
   - Si estás utilizando **Maven**, asegúrate de que el archivo `pom.xml` esté configurado correctamente.
     Las dependencias necesarias para la aplicación son `OkHttp` y `Gson`.
   - Para instalar las dependencias, ejecuta:
     ```bash
     mvn install
     ```

4. **Obtener una Clave API**:
   - Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/) y obtén una clave API.
   - Reemplaza la clave de API en tu código en la clase `ConversorDivisas.java`.

5. **Ejecutar el Programa**:
   - Desde la terminal, ejecuta el siguiente comando:
     ```bash
     java MainApp
     ```

## Tecnologías Utilizadas

1. **Java**: Lenguaje de programación utilizado para desarrollar la aplicación. 
2. **Maven**: Herramienta de gestión de proyectos y dependencias que se utiliza para compilar, probar y empaquetar la aplicación.
3. **OkHttp**: Biblioteca de cliente HTTP para Java que se utiliza para realizar solicitudes a la API de ExchangeRate y obtener tasas de cambio en tiempo real.
4. **Gson**: Biblioteca para la serialización y deserialización de objetos Java a JSON y viceversa. Se utiliza para manejar la respuesta JSON de la API de ExchangeRate.
5. **API de ExchangeRate**: Servicio en línea que proporciona tasas de cambio de divisas actualizadas. Se integra en la aplicación para permitir conversiones de
   divisas en tiempo real.
7. **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE) recomendado para la codificación, depuración y ejecución del proyecto.

## Autor

Este proyecto fue desarrollado por Yuli Moreno

[![GitHub](https://img.shields.io/badge/GitHub-Profile-informational?logo=github)](https://github.com/YuliMoreno)



