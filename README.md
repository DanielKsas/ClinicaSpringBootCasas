🏥 ClinicaSpringBootCasas

💻 Para este trabajo principalmente usé Java y Spring Boot, ya estando en el spring boot decidí usar 6 dependecias, las cuáles fueron:
🧩 JPA, 🐬 MySQL, 💾 H2, 🔁 Devtools, 🌐 Spring Boot Web y 🧪 Spring Boot Starter Test.

❓ ¿Por qué 6 si únicamente hemos visto 5 en clase?
👉 Esto fué porque descubrí que la dependencia Spring Boot Starter Test en un proyecto es una buena práctica. Esta dependencia está más como de adorno, aunque se puede quedar fuera o ser agregada, decidí agregarla únicamente por las buenas prácticas.

📦 Una vez descargado el paquete con las dependencias, descomprimí el archivo y empecé a trabajar.
🗂️ Lo primero que hice fué abrir la carpeta resources, y dentro de esa carpeta modificar el archivo application.properties, donde se agregó el número de puerto, el nombre de la base de datos, la password vacía, etc.

👨‍💻 Una vez hecho esto, pasé a crear las 4 clases:

ClinicalHistory 🧠

Doctor 🩺

Patient 👤

ProfessionalCard 🪪

Luego agregué los atributos a cada clase.
Una vez finalizada esta parte, empecé a crear los constructores, tanto los vacíos como los que contienen los atributos, getters y setters, esto para que el JPA y Spring Boot funcionen correctamente en el tema de las entidades y mapeo (relación).

🖥️ Cuando terminé esta parte, abrí el xampp, creé la base de datos con el nombre que había agregado en el archivo application.propierties (ya mencionado anteriormente), y luego empecé a poner las anotaciones:
@Entity, @Table, @Id, @GeneratedValue, @OneToOne y @JoinColumn.

📚 En el GeneratedValue decidí usar como estrategia el identity, para que el motor de la base de datos cree el valor de la ID automáticamente.

🧩 También importé jakarta.persistence.*; para traer de una vez todo lo relacionado con JPA (por ejemplo .entity, .table, etc.) sin tener que importarlos uno a uno.

📘 Por último, es importante aclarar que resolví este trabajo basándome en el trabajo hecho en clase, llamado ApiUno, que está también en un repositorio propio del github.
