<h1 align="center">Librería de Conversión de Unidades en Java</h1>

<p align="center">
  Esta es una librería en Java que permite realizar conversiones entre diferentes unidades de medida, como longitud, masa, temperatura, volumen, área, velocidad, tiempo, energía y presión. Incluye una interfaz gráfica de usuario (GUI) para facilitar las conversiones.
</p>

<h2>📥 Descargar e Importar el JAR</h2>

<ol>
  <li>https://github.com/lenier522/Convertidor/releases
    <strong>Descarga el archivo JAR:</strong><br>
    Puedes descargar el archivo <code>.jar</code> de la librería desde la sección de <a href="https://github.com/lenier522/Convertidor/releases">Releases</a> del repositorio.
  </li>
  <li>
    <strong>Agrega el JAR a tu proyecto:</strong><br>
    <ul>
      <li>
        Si estás usando un IDE como <strong>IntelliJ IDEA</strong> o <strong>Eclipse</strong>, sigue estos pasos:
        <ul>
          <li>
            En <strong>IntelliJ</strong>:<br>
            Ve a <code>File > Project Structure > Libraries</code>, haz clic en <code>+</code>, selecciona <code>Java</code>, y elige el archivo <code>.jar</code> descargado.
          </li>
          <li>
            En <strong>Eclipse</strong>:<br>
            Haz clic derecho en tu proyecto, selecciona <code>Build Path > Add External Archives</code>, y elige el archivo <code>.jar</code>.
          </li>
        </ul>
      </li>
      <li>
        Si estás compilando desde la línea de comandos, incluye el JAR en tu classpath:<br>
        <pre><code>javac -cp ruta/al/tu-archivo.jar TuClasePrincipal.java
java -cp .:ruta/al/tu-archivo.jar TuClasePrincipal</code></pre>
      </li>
    </ul>
  </li>
</ol>

<h2>🚀 Uso de la Librería</h2>

<h3>Uso Básico</h3>
<p>Para realizar conversiones, importa la clase <code>UnitCategory</code> y utiliza el método <code>convertir</code>:</p>
<pre><code>import conversion.UnitCategory;

public class Main {
    public static void main(String[] args) {
        double resultado = UnitCategory.convertir(
            UnitCategory.TipoUnidad.LONGITUD, // Tipo de unidad
            "m",                              // Unidad de origen
            "km",                             // Unidad de destino
            1000                              // Valor a convertir
        );
        System.out.println("Resultado: " + resultado + " km");
    }
}</code></pre>

<h3>Interfaz Gráfica (GUI)</h3>
<p>Si prefieres usar la interfaz gráfica, simplemente ejecuta la clase <code>Main</code> incluida en el JAR:</p>
<pre><code>import javax.swing.*;

public class EjecutarGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true); // Inicia la interfaz gráfica
        });
    }
}</code></pre>

<h2>📊 Categorías y Unidades Soportadas</h2>
<p>La librería soporta las siguientes categorías y unidades:</p>
<ul>
  <li><strong>Longitud</strong>: metros (m), kilómetros (km), centímetros (cm), etc.</li>
  <li><strong>Masa</strong>: kilogramos (kg), gramos (g), libras (lb), etc.</li>
  <li><strong>Temperatura</strong>: Celsius (C), Fahrenheit (F), Kelvin (K).</li>
  <li><strong>Volumen</strong>: litros (l), mililitros (ml), galones (gal), etc.</li>
  <li><strong>Área</strong>: metros cuadrados (m²), kilómetros cuadrados (km²), etc.</li>
  <li><strong>Velocidad</strong>: km/h, m/s, mph, etc.</li>
  <li><strong>Tiempo</strong>: segundos (s), minutos (min), horas (h), etc.</li>
  <li><strong>Energía</strong>: julios (J), calorías (cal), vatios-hora (Wh), etc.</li>
  <li><strong>Presión</strong>: pascales (Pa), atmósferas (atm), bares (bar), etc.</li>
</ul>

<h2>📝 Ejemplo de Conversión</h2>
<p>Aquí tienes un ejemplo de cómo convertir 1000 metros a kilómetros:</p>
<pre><code>double resultado = UnitCategory.convertir(
    UnitCategory.TipoUnidad.LONGITUD, // Tipo de unidad
    "m",                              // Unidad de origen
    "km",                             // Unidad de destino
    1000                              // Valor a convertir
);
System.out.println("Resultado: " + resultado + " km"); // Resultado: 1.0 km</code></pre>

<h2>🤝 Contribuciones</h2>
<p>Si deseas contribuir a este proyecto, ¡eres bienvenido! Por favor, sigue estos pasos:</p>
<ol>
  <li>Haz un fork del repositorio.</li>
  <li>Crea una nueva rama para tu contribución.</li>
  <li>Realiza tus cambios y envía un pull request.</li>
</ol>

<h2>📜 Licencia</h2>
<p>Este proyecto está bajo la licencia MIT. Consulta el archivo <a href="LICENSE">LICENSE</a> para más detalles.</p>

<h2>📧 Contacto</h2>
<p>Si tienes preguntas o sugerencias, no dudes en contactarme:</p>
<ul>
  <li>📧 <a href="leniercruz02@gmail.com">lenier</a></li>
  <li>🌐 <a href="https://github.com/lenier522">GitHub</a></li>
</ul>
