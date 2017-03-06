package com.salesmanager.core.model.generic;

import java.io.Serializable;
import java.text.Collator;
import java.util.Locale;



/**
 * <p>Entité racine pour la persistence des objets via JPA.</p>
 *
 * @param <K>
 * @param <E> type de l'entité
 */
public abstract class SalesManagerEntity<K extends Serializable & Comparable<K>, E extends SalesManagerEntity<K, ?>>
		implements Serializable, Comparable<E> {
    private static final long serialVersionUID = -2055740315753020771L;

	public static final Collator DEFAULT_STRING_COLLATOR = Collator.getInstance(Locale.FRENCH);
	
	static {
		DEFAULT_STRING_COLLATOR.setStrength(Collator.PRIMARY);
	}
	
	/**
	 * Retourne la valeur de l'identifiant unique.
	 * 
	 * @return id
	 */
	public abstract K getId();

	/**
	 * Définit la valeur de l'identifiant unique.
	 * 
	 * @param id id
	 */
	public abstract void setId(K id);
	
	/**
	 * Indique si l'objet a déjà été persisté ou non
	 * 
	 * @return vrai si l'objet n'a pas encore été persisté
	 */
	public boolean isNew() {
		return getId() == null;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (object == this) {
			return true;
		}
		
		// l'objet peut être proxyfié donc on utilise Hibernate.getClass() pour sortir la vraie classe
		if (object.getClass() != this.getClass()) {
			return false;
		}

		SalesManagerEntity<K, E> entity = (SalesManagerEntity<K, E>) object; // NOSONAR : traité au-dessus mais wrapper Hibernate 
		K id = getId();

		if (id == null) {
			return false;
		}

		return id.equals(entity.getId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		
		K id = getId();
		hash = 31 * hash + ((id == null) ? 0 : id.hashCode());

		return hash;
	}

        @Override
	public int compareTo(E o) {
		if (this == o) {
			return 0;
		}
		return this.getId().compareTo(o.getId());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("entity.");
		builder.append(this.getClass().getSimpleName());
		builder.append("<");
		builder.append(getId());
		builder.append("-");
		builder.append(super.toString());
		builder.append(">");
		
		return builder.toString();
	}
}