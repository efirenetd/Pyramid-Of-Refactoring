package pl.refactoring.interpreter.completed.spec;

import pl.refactoring.interpreter.completed.Spec;

import java.util.ArrayList;
import java.util.List;

public class AndSpecBuilder {
    private List<Spec> specs = new ArrayList<>();


    public AndSpecBuilder withSpecs(Spec spec) {
        specs.add(spec);
        return this;
    }

    public AndSpec build() {
        return new AndSpec(specs.toArray(new Spec[specs.size()]));
    }
}