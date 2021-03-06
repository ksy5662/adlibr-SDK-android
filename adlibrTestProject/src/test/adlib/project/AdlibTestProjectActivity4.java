package test.adlib.project;
import com.mocoplex.adlib.AdlibAdViewContainer;
import com.mocoplex.adlib.AdlibManager;
import com.mocoplex.adlib.AdlibManager.AdlibVersionCheckingListener;

import android.app.Activity;
import android.os.Bundle;

public class AdlibTestProjectActivity4 extends Activity {
    
	// 일반 Activity 에서의 adlib 연동	
	private AdlibManager _amanager;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		_amanager = new AdlibManager();
		_amanager.onCreate(this);
		
		// 일반적인 연동은 추가적으로 구현필요
        setContentView(R.layout.main2);
        this.setAdsContainer(R.id.ads);   
	}

	protected void onResume()
	{		
		_amanager.onResume(this);
		super.onResume();
	}
	
    protected void onPause()
    {    	
    	_amanager.onPause();
    	super.onPause();
    }
    
    protected void onDestroy()
    {    	
    	_amanager.onDestroy(this);
    	super.onDestroy();
    }
    
	public void setAdsContainer(int rid)
	{
		_amanager.setAdsContainer(rid);
	}
	
	public void bindAdsContainer(AdlibAdViewContainer a)
	{
		_amanager.bindAdsContainer(a);		
	}
	
	public void setVersionCheckingListner(AdlibVersionCheckingListener l)
	{
		_amanager.setVersionCheckingListner(l);		
	}
	
	public void destroyAdsContainer()
	{
		_amanager.destroyAdsContainer();
	}	
	// 애드립 연동에 필요한 구현부 끝    
}