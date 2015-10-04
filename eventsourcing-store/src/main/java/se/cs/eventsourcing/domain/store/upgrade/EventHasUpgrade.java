package se.cs.eventsourcing.domain.store.upgrade;

import se.cs.eventsourcing.domain.store.DomainEvent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventHasUpgrade {
    Class<? extends DomainEvent> value();
}
