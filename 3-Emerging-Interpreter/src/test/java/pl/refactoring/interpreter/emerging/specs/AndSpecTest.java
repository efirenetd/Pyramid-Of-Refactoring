package pl.refactoring.interpreter.emerging.specs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.refactoring.interpreter.emerging.RealEstate;
import pl.refactoring.interpreter.emerging.Spec;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class AndSpecTest {

    private Spec yesSpec;

    @BeforeEach
    void setUp() {
        yesSpec = Mockito.mock(Spec.class);
        when(yesSpec.isSatisfiedBy(any(RealEstate.class)))
                .thenReturn(Boolean.TRUE);
    }

    @Test
    void shouldVerifyTwoComponentsInCaseOfTesResults() {
        //Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec);

        //When
        boolean andResult = andSpec.isSatisfiedBy(mock(RealEstate.class));

        //Then
        assertTrue(andResult);

        verify(yesSpec, times(2)).isSatisfiedBy(any(RealEstate.class));

    }

    @Test
    void shouldVerifyThreeComponentsInCaseOfTesResults() {
        //Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec, yesSpec);

        //When
        boolean andResult = andSpec.isSatisfiedBy(mock(RealEstate.class));

        //Then
        assertTrue(andResult);

        verify(yesSpec, times(3)).isSatisfiedBy(any(RealEstate.class));

    }
}