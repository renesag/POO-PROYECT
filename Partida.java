package poo.videojuego.ui;

public Interface Partida{
	public void configura(FabricaDeObjetos fabrica,String archivo,PartidaUI ui,int totalRondas,int itemsIniciales);
	public void inicia();
	public void ejecutaAccion(Accion accion);
	public Collection<Item> getItemsDisponibles();
	public Collection<Ataque> getAtaquesDisponibles();
	public Collection<Personajes> getPersonajes();
	public Personaje getPersonajeEnTurno();
	public int getRondaActual();
	public int getTotalDeRondas();
	public void itemUsado(Item item);
}