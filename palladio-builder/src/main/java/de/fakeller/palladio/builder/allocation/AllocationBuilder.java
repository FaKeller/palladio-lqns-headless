package de.fakeller.palladio.builder.allocation;

import de.fakeller.palladio.builder.EntityBuilder;
import de.fakeller.palladio.builder.resourceenvironment.ContainerBuilder;
import de.fakeller.palladio.builder.system.AssemblyBuilder;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * Creates Palladio {@link Allocation}s that map {@link AllocationContext}s to {@link ResourceContainer}s.
 */
public interface AllocationBuilder extends EntityBuilder<AllocationBuilder, Allocation> {

    /**
     * Run the given container on the given assembly.
     */
    AllocationBuilder allocate(AssemblyBuilder assembly, ContainerBuilder container);
}
