package Configuracion;

import kotlin.text.UStringsKt;

public class Trans
{
    //version database
    public static int version =1;
    // Nombre de la base de Datos

    public static final String DBname = "PM012P";

    // Tabla Personas
    public static final String TablePersonas = "personas";


    //Propiedades

    public static final String id = "id";
    public static final String nombres = "nombres";

    public static final String apellidos = "apellidos";

    public static final String edad = "edad";
    public static final String correo = "correo";

    public static final String foto = "foto";


    // DDL Create
    public static final String CreateTablePersonas = "CREATE TABLE" + TablePersonas + "("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER, correo TEXT, foto TEXT )";

    public static final String SelectAllPerson = "SELECT * FROM "+ TablePersonas;
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS" + TablePersonas;

}
