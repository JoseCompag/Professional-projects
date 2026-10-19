package assignment5_exercises.thermostat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static assignment5_exercises.thermostat.Period.*;
import static assignment5_exercises.thermostat.DayType.*;

import static org.junit.jupiter.api.Assertions.*;

/*
Cláusulas
- c1: curTemp < dTemp - thresholdDiff
- c2: override
- c3: curTemp < overTemp - thresholdDiff
- c4: timeSinceLastRun > minLag

Predicados
- p1: (c1 v (c2 ∧ c3)) ∧ c4
- p2: c2
*/


public class ThermostatTest {

  private static ProgrammedSettings pSet = new ProgrammedSettings();
  private static Thermostat th = new Thermostat();

  @BeforeAll
  public static void setUp() {
    pSet.setSetting(MORNING, WEEKDAY, 70);
    //pSet.setSetting(MORNING, WEEKEND, 70);

    th.setDay(WEEKDAY);
    th.setPeriod(MORNING);
  }

  private static Stream<Arguments> CC() {
    return Stream.of(
      Arguments.of(60,5,false,65,5,10,false), // c1 = true
      Arguments.of(70,5,false,85,5,10,false), // c1 = false

      Arguments.of(70,5,true,65,5,10,false), // c2 = true
      Arguments.of(70,5,false,80,10,5,false), // c2 = false

      Arguments.of(70,5,false,80,5,10,false), // c3 = true
      Arguments.of(70,5,false,65,15,10,false), // c3 = false

      Arguments.of(70,5,true,70,15,10,false), // c4 = true
      Arguments.of(70,5,true,70,5,10,false) // c4 = false

    );
  }

  @ParameterizedTest
  @MethodSource("CC")
  public void thermostatTest_CC(int curTemp, int thresholdDiff, boolean override,
                                int overTemp, int timeSinceLastRun, int minLag,
                                boolean expected) {

    th.setCurrentTemp(curTemp);
    th.setThresholdDiff(thresholdDiff);
    th.setOverride(override);
    th.setOverTemp(overTemp);
    th.setTimeSinceLastRun(timeSinceLastRun);
    th.setMinLag(minLag);

    boolean res = th.turnHeaterOn(pSet);
    assertEquals(res, expected);
  }

  private static Stream<Arguments> PC() {
    return Stream.of(
      Arguments.of(60,5,true,65,10,5,true), // p1 = true
      Arguments.of(60,5,false,70,5,10,false), // p1 = false

      Arguments.of(65,5,true,75,10,5,true), // p2 = true
      Arguments.of(60,5,false,65,10,5,true) // p2 = false
    );
  }

  @ParameterizedTest
  @MethodSource("PC")
  public void thermostatTest_PC(int curTemp, int thresholdDiff, boolean override,
                                int overTemp, int timeSinceLastRun, int minLag,
                                boolean expected) {

    th.setCurrentTemp(curTemp);
    th.setThresholdDiff(thresholdDiff);
    th.setOverride(override);
    th.setOverTemp(overTemp);
    th.setTimeSinceLastRun(timeSinceLastRun);
    th.setMinLag(minLag);

    boolean res = th.turnHeaterOn(pSet);
    assertEquals(res, expected);

  }

  private static Stream<Arguments> CACC() {
    return Stream.of(
      //c1
      Arguments.of(60,5,false,65,10,5,true), // c1=T, c2=F, c3=F, c4=T
      Arguments.of(65,5,false,65,10,5,false), // c1=F, c2=F, c3=F, c4=T
      //c2
      Arguments.of(65,5,true,75,10,5,true), //  c1=F, c2=T, c3=T, c4 =T
      Arguments.of(65,5,false,75,10,5,false), // c1=F, c2=F, c3=T, c4 =T
      //c3
      Arguments.of(65,5,true,75,10,5,true), // c1=F, c2=T, c3=T, c4=T
      Arguments.of(65,5,true,65,10,5,false), // c1=F, c2=T, c3=F, c4=T
      //c4
      Arguments.of(65,5,true,75,10,5,true), // c1=F, c2=T, c3=T, c4=T
      Arguments.of(65,5,true,75,10,10,false) // c1=F, c2=T, c3=T, c4=F
    );
  }

  @ParameterizedTest
  @MethodSource("CACC")
  public void thermostatTest_CACC(int curTemp, int thresholdDiff, boolean override,
                                  int overTemp, int timeSinceLastRun, int minLag,
                                  boolean expected) {

    th.setCurrentTemp(curTemp);
    th.setThresholdDiff(thresholdDiff);
    th.setOverride(override);
    th.setOverTemp(overTemp);
    th.setTimeSinceLastRun(timeSinceLastRun);
    th.setMinLag(minLag);

    boolean res = th.turnHeaterOn(pSet);
    assertEquals(res, expected);

  }
}
