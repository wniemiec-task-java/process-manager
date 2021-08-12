/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.task.java;

import java.io.IOException;

class WindowsProcessManager extends ProcessManager {
	
	//-------------------------------------------------------------------------
	//		Methods
	//-------------------------------------------------------------------------
	public void forceKillProcessWithPid(long pid) throws IOException {
		runtime.exec("taskkill /F /PID" + pid);
	}
}
