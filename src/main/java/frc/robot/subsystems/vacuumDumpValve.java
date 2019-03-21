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
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class vacuumDumpValve extends Subsystem {

  Relay vacuumDump = new Relay(RobotMap.VACUUM_DUMP_RELAY_PORT, Direction.kForward);

  public vacuumDumpValve() {
    vacuumDump.set(Relay.Value.kOff);
  }

  public void makeSuction() {
    vacuumDump.set(Relay.Value.kOff);
  }

  public void releaseSuction() {
    vacuumDump.set(Relay.Value.kOn);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
