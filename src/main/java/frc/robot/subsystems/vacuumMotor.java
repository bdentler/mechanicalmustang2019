/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.Relay.Value;
import frc.robot.RobotMap;

public class vacuumMotor extends Subsystem {

  Relay vacMotor = new Relay(RobotMap.VACUUM_RELAY_PORT, Direction.kForward);

  public vacuumMotor() {
    vacMotor.set(Relay.Value.kOff);
  }

  public void startVacuum() {
    vacMotor.set(Relay.Value.kOn);
  }

  public Value vacState() {
    return vacMotor.get();
  }

  public void stopVacuum() {
    vacMotor.set(Relay.Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
  }
}
