package com.binus.studentprofile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView studentName;
    private TextView studentNim;
    private TextView aboutText;
    private TextView emailText;
    private TextView linkedinText;
    private TextView githubText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        initializeViews();
        
        // Set up click listeners
        setupClickListeners();
        
        // Load profile data
        loadProfileData();
    }

    private void initializeViews() {
        profileImage = findViewById(R.id.profile_image);
        studentName = findViewById(R.id.student_name);
        studentNim = findViewById(R.id.student_nim);
        aboutText = findViewById(R.id.about_text);
        emailText = findViewById(R.id.email_text);
        linkedinText = findViewById(R.id.linkedin_text);
        githubText = findViewById(R.id.github_text);
    }

    private void setupClickListeners() {
        // Email click listener
        emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open email app
                openEmailApp();
            }
        });

        // LinkedIn click listener
        linkedinText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open LinkedIn profile
                openLinkedInProfile();
            }
        });

        // GitHub click listener
        githubText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open GitHub profile
                openGitHubProfile();
            }
        });

        // Profile image click listener
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open image picker or show full image
                showProfileImageDialog();
            }
        });
    }

    private void loadProfileData() {
        // Set student information
        studentName.setText("I Putu Gede Arya Cahya Wiguna");
        studentNim.setText("NIM: 2702330123");
        
        // Set about text
        aboutText.setText("Halo! Saya adalah mahasiswa BINUS University yang sedang menempuh pendidikan di bidang teknologi. Saya memiliki passion dalam pengembangan web dan teknologi informasi.");
        
        // Set contact information
        emailText.setText("arya.wiguna@binus.ac.id");
        linkedinText.setText("LinkedIn Profile");
        githubText.setText("GitHub Profile");
        
        // You can load profile image from URL or local resource
        // profileImage.setImageResource(R.drawable.profile_photo);
    }

    private void openEmailApp() {
        // Implementation to open email app
        // Intent emailIntent = new Intent(Intent.ACTION_SEND);
        // emailIntent.setType("text/plain");
        // emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"arya.wiguna@binus.ac.id"});
        // startActivity(Intent.createChooser(emailIntent, "Send Email"));
    }

    private void openLinkedInProfile() {
        // Implementation to open LinkedIn profile
        // Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
        // linkedinIntent.setData(Uri.parse("https://linkedin.com/in/your-profile"));
        // startActivity(linkedinIntent);
    }

    private void openGitHubProfile() {
        // Implementation to open GitHub profile
        // Intent githubIntent = new Intent(Intent.ACTION_VIEW);
        // githubIntent.setData(Uri.parse("https://github.com/your-username"));
        // startActivity(githubIntent);
    }

    private void showProfileImageDialog() {
        // Implementation to show profile image in full screen or image picker
        // You can create a dialog or new activity to show full image
    }
}
