package de.fabiankeller.palladio.builder;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * Used to build Palladio {@link Entity}s (model instances).
 *
 * @param <SELF> the child interface extending this interface. This is used to provide a proper fluent interface.
 * @param <TYPE> The Palladio {@link Entity} class that is built by this builder
 */
public interface EntityBuilder<
        SELF extends EntityBuilder<SELF, TYPE>,
        TYPE extends Entity
        > {

    /**
     * Sets the name of the entity.
     */
    default SELF withEntityName(final String name) {
        this.getReference().setEntityName(name);
        return (SELF) this;
    }

    /**
     * Sets the id of the entity.
     */
    default SELF withId(final String id) {
        this.getReference().setId(id);
        return (SELF) this;
    }

    /**
     * Returns a reference to the palladio model.
     * <p>
     * Note: calls to this method should only be performed by {@link EntityBuilder}s, as the sole purpose of the method
     * is to return an object reference. The returned object may not have been fully constructed and is thus likely to
     * have an inconsistent state.
     *
     * @return reference to the entity under construction
     */
    TYPE getReference();

    /**
     * Returns the built palladio model instance.
     * <p>
     * Validates and builds the model instance.
     *
     * @return the built instance.
     */
    TYPE build() throws EntityViolationException;


}
