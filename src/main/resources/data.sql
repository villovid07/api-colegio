
INSERT INTO colegio (id, nombre) VALUES(1, 'El colegio del Olimpo');


INSERT INTO curso (id, grado, salon, idcolegio) VALUES(1, 10, 'A', 1);
INSERT INTO curso (id, grado, salon, idcolegio) VALUES(2, 10, 'B', 1);
INSERT INTO curso (id, grado, salon, idcolegio) VALUES(3, 11, 'A', 1);
INSERT INTO curso (id, grado, salon, idcolegio) VALUES(4, 11, 'B', 1);


INSERT INTO profesor (id, nombre) VALUES(1, 'Némesis');
INSERT INTO profesor (id, nombre) VALUES(2, 'Príapo');
INSERT INTO profesor (id, nombre) VALUES(3, 'Iris');


INSERT INTO estudiante (id, nombre) VALUES(1, 'Afrodita');
INSERT INTO estudiante (id, nombre) VALUES(2, 'Apolo');
INSERT INTO estudiante (id, nombre) VALUES(3, 'Ares');
INSERT INTO estudiante (id, nombre) VALUES(4, 'Artemisa');
INSERT INTO estudiante (id, nombre) VALUES(5, 'Atenea');
INSERT INTO estudiante (id, nombre) VALUES(6, 'Dionisio');
INSERT INTO estudiante (id, nombre) VALUES(7, 'Hefesto');
INSERT INTO estudiante (id, nombre) VALUES(8, 'Hera');
INSERT INTO estudiante (id, nombre) VALUES(9, 'Hermes');
INSERT INTO estudiante (id, nombre) VALUES(10, 'Hades');
INSERT INTO estudiante (id, nombre) VALUES(11, 'Poseidón');
INSERT INTO estudiante (id, nombre) VALUES(12, 'Zeus');


INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(1, 1, 'Matemáticas', 1);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(2, 2, 'Español', 1);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(3, 3, 'Ingles básico', 1);


INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(4, 1, 'Matemáticas', 2);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(5, 2, 'Español', 2);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(6, 3, 'Ingles avanzado', 2);

INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(7, 1, 'Matemáticas', 3);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(8, 1, 'Pre Icfes', 3);


INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(9, 1, 'Matemáticas', 4);
INSERT INTO asignatura (id, idprofesor, nombre, idcurso) VALUES(10, 1, 'Pre Icfes', 4);


INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (1,1,1);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (2,1,2);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (3,1,3);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (4,2,1);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (5,2,2);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (6,2,3);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (7,3,1);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (8,3,2);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (9,3,3);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (10,4,4);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (11,4,5);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (12,4,6);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (13,5,4);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (14,5,5);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (15,5,6);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (16,6,4);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (17,6,5);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (18,6,6);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (19,7,7);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (20,7,8);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (21,8,7);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (22,8,8);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (23,9,9);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (24,9,10);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (25,9,11);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (26,9,12);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (27,10,9);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (28,10,10);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (29,10,11);
INSERT INTO asignatura_estudiante (id, idasignatura , idestudiante) VALUES (30,10,12);






