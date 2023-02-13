package com.wikitude.wikitudestudioandroidapptemplate;

public interface ArchitectViewHolderInterface {
	
	/**
	 * 50km = architectView's default cullingDistance, return this value in "getInitialCullingDistanceMeters()" to not change cullingDistance.
	 */
	int CULLING_DISTANCE_DEFAULT_METERS = 50 * 1000;
	
	/**
	 * @return path to the architect-file (AR-Experience HTML) to launch
	 */
	String getARchitectWorldPath();

	/**
	 * @return layout id of your layout.xml that holds an ARchitect View, e.g. R.layout.camview
	 */
	int getContentViewId();
	
	/**
	 * @return Wikitude SDK license key, checkout www.wikitude.com for details
	 */
	String getWikitudeSDKLicenseKey();
	
	/**
	 * @return layout-id of architectView, e.g. R.id.architectView
	 */
	int getArchitectViewId();

	/**
	 * sets maximum distance to render places. In case your places are more than 50km away from the user you must adjust this value (compare 'AR.context.scene.cullingDistance').
	 * @return ArchitectViewHolder.CULLING_DISTANCE_DEFAULT_METERS to not change default behavior (50km range) or any positive float to set cullingDistance on architectView start.
	 */
	float getInitialCullingDistanceMeters();
}
