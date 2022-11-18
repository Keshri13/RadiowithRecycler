package com.example.finaldemo3.ui.gallery;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.finaldemo3.databinding.FragmentContributeBinding;

public class ContributeFragment extends Fragment {

    private FragmentContributeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContributeViewModel contributeViewModel =
                new ViewModelProvider(this).get(ContributeViewModel.class);

        binding = FragmentContributeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final WebView webView = binding.webViewContribute;
        //contributeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        final ProgressBar progressBar = binding.pbContribute;

        webView.loadUrl("https://www.geeksforgeeks.org/contribute");

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }
        });
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        webView.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyEvent.getAction()==KeyEvent.ACTION_DOWN){
                    switch (keyCode){
                        case KeyEvent.KEYCODE_BACK:
                            if(webView.canGoBack()){
                                webView.goBack();
                            }
                    }
                }
                return false;
            }

        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}