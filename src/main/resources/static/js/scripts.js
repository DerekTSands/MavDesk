// scripts.js

document.addEventListener('DOMContentLoaded', function () {
    const toggleButton = document.getElementById('toggle-form');
    const formTitle = document.getElementById('form-title');
    const authForm = document.getElementById('auth-form');
    const toggleText = document.querySelector('.text-center');

    toggleButton.addEventListener('click', function () {
        if (formTitle.textContent === 'Sign Up') {
            formTitle.textContent = 'Login';
            authForm.innerHTML = `
                <div class="form-group position-relative">
                    <input type="text" class="form-control" placeholder="User name" name="username" required>
                    <i class="fas fa-user form-icon"></i>
                </div>
                <div class="form-group position-relative">
                    <input type="password" class="form-control" placeholder="Password" name="password" required>
                    <i class="fas fa-lock form-icon"></i>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
            `;
            toggleText.textContent = "Don't Have Account?";
            toggleButton.textContent = 'Register';
        } else {
            formTitle.textContent = 'Sign Up';
            authForm.innerHTML = `
                <div class="form-group position-relative">
                    <input type="text" class="form-control" placeholder="User name" name="username" required>
                    <i class="fas fa-user form-icon"></i>
                </div>
                <div class="form-group position-relative">
                    <input type="email" class="form-control" placeholder="Email" name="email" required>
                    <i class="fas fa-envelope form-icon"></i>
                </div>
                <div class="form-group position-relative">
                    <input type="password" class="form-control" placeholder="Password" name="password" required>
                    <i class="fas fa-lock form-icon"></i>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
            `;
            toggleText.textContent = 'Already Have Account?';
            toggleButton.textContent = 'Login';
        }
    });
});
