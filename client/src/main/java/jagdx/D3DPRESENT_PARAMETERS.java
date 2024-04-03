package jagdx;

import java.awt.Component;

public class D3DPRESENT_PARAMETERS {

    public int BackBufferWidth = 0;

    public int BackBufferHeight = 0;

    public int BackBufferFormat = 0;

    public int BackBufferCount = 0;

    public int MultiSampleType = 0;

    public int MultiSampleQuality = 0;

    public int SwapEffect = 1;

    public Component DeviceWindow;

    public boolean Windowed;

    public boolean EnableAutoDepthStencil;

    public int AutoDepthStencilFormat = 0;

    public int Flags;

    public int FullScreen_RefreshRateInHz;

    public int PresentationInterval = Integer.MIN_VALUE;

    public D3DPRESENT_PARAMETERS(Component arg0) {
        this.DeviceWindow = arg0;
    }
}
