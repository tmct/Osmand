package net.osmand.plus.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import net.osmand.PlatformUtil;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.R;
import net.osmand.plus.Version;

import org.apache.commons.logging.Log;

public class WhatsNewDialogFragment extends DialogFragment {
	private static final Log LOG = PlatformUtil.getLog(WhatsNewDialogFragment.class);
	private static final String FILE_ANDROID_ASSET_HELP = "file:///android_asset/help/";

	@NonNull
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		final OsmandApplication osmandApplication = (OsmandApplication) getActivity().getApplication();
		final String appVersion = Version.getAppVersion(osmandApplication);
		builder.setTitle("What's new in " + appVersion)
				.setMessage(getString(R.string.last_release))
				.setNegativeButton(R.string.shared_string_close, null);
		// TODO: 10/28/15 Implement
		builder.setPositiveButton("Read more", null);
		return builder.create();
	}
}