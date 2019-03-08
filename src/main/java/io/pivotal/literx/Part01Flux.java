package io.pivotal.literx;

import org.assertj.core.util.Arrays;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux
 * Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

    // TODO Return an empty Flux
    Flux<String> emptyFlux() {
        return Flux.empty();
    }

//========================================================================================

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

//========================================================================================

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    Flux<String> fooBarFluxFromList() {
        return Flux.fromArray(Arrays.array("foo", "bar"));
    }

//========================================================================================

    // TODO Create a Flux that emits an IllegalStateException
    Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

//========================================================================================

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    Flux<Long> counter() {
//        return Flux.range(0, 10).map(i -> Long.valueOf(i)).delayElements(Duration.ofMillis(100)).log();
//        return Flux.range(0, 10).map(i -> Long.valueOf(i)).delaySequence(Duration.ofMillis(100)).log();
        return Flux.interval(Duration.ofMillis(100)).take(10).log();
    }

}
