/* Riaño Enriquez Donovan, Grupo 3 POO, Prof: M.I. Edgar Tista García, Practica 2, 17/febrero/2019 */	

class Promedio2{
	public float prom(float tar, float exam, float proyec, float lab){

		float tareas,examenes,proyectos,laboratorio,redondeo,calif;
		tareas= (tar * 15)/ 100;
		examenes = (exam * 35) / 100;
		proyectos = (proyec * 30)/100;
		laboratorio = (lab * 25)/ 100;

		calif = tareas + examenes + proyectos + laboratorio;
		redondeo = Math.round(calif);
		return calif;

	}
}