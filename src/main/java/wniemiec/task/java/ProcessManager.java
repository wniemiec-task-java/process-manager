/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.task.java;

import java.io.IOException;

/**
 * Responsible for managing processes.
 */
public abstract class ProcessManager {
	
	//-------------------------------------------------------------------------
	//		Attributes
	//-------------------------------------------------------------------------
	protected Runtime runtime = Runtime.getRuntime();
	
	
	//-------------------------------------------------------------------------
	//		Methods
	//-------------------------------------------------------------------------
	public static ProcessManager getInstance() {
		if (isWindowsOS())
			return new WindowsProcessManager();
		else
			return new UnixProcessManager();
	}
	
	public abstract void forceKillProcessWithPid(long pid) throws IOException;
	
	private static boolean isWindowsOS() {
		return System.getProperty("os.name").toLowerCase().contains("windows");
	}
}
