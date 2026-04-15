Evaluación Parcial 1 de FullStack 1
Agregados:
  + Mostrar todo
  + Agregar registro
  + Actualizar registro
  + Eliminar registro
  + Buscar registro por criterios
  + Manejo de errores
  + Validaciones
  + Mensajes de error

Faltó:
  - Ordenar por Prioridad
  - Validar que la prioridad y el sea una de las palabras aporvadas

TESTEO PARA REVISION
  GET localhost:8081/api/v1/incidencias
  POST localhost:8081/api/v1/incidencias
    {
      "descripcion": "Filtrar por prioridad no ordena",
      "estado": "En revision",
      "prioridad": "alta",
      "autor": "Rocio"
    }

    
  
