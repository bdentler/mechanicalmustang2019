/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Relay;
//import edu.wpi.first.wpilibj.Relay.Direction;
//import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Talon;
import frc.robot.RobotMap;

public class vacuumMotor extends Subsystem {

  //Relay vacMotor = new Relay(RobotMap.VACUUM_RELAY_PORT, Direction.kForward);
  Talon vacMotor = new Talon(RobotMap.VACUUM_MOTOR_PWM);

  public vacuumMotor() {
    //vacMotor.set(Relay.Value.kOff);
  }

  public double vacuumState() {
    return vacMotor.getSpeed();
  }

  public void startVacuum() {
    //vacMotor.set(Relay.Value.kOn);
    double currentSpeed = vacMotor.getSpeed();
    if (currentSpeed <= RobotMap.VACUUM_MAX_SPEED) {
      vacMotor.setSpeed(currentSpeed + RobotMap.VACUUM_RAMP);
    } else {
      vacMotor.setSpeed(RobotMap.VACUUM_MAX_SPEED);
    }
  }
/*
  public Value vacState() {
    return vacMotor.get();
  }
*/
  public boolean vacState() {
    if (vacMotor.getSpeed() > 0) {
      return true;
    } else {
      return false;
    }
  }

  public void stopVacuum() {
    //vacMotor.set(Relay.Value.kOff);
    vacMotor.setSpeed(0);
  }

  @Override
  public void initDefaultCommand() {
  }
}
