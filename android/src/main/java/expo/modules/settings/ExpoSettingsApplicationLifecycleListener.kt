package expo.modules.settings
import android.widget.Toast
import android.app.Application
import expo.modules.core.interfaces.ApplicationLifecycleListener

class ExpoSettingsApplicationLifecycleListener : ApplicationLifecycleListener {
  override fun onCreate(application: Application) {
Toast.makeText(application,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
  }

}
