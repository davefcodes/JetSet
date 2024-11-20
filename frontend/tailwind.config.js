/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './*.html', // Root HTML files
    "./**/*.html", // All HTML files in the views folder
    './frontend/scripts/**/*.{js,jsx,ts,tsx}', // JS/TS files if needed
  ],
  theme: {
    screens: {
      sm: '480px',
      md: '768px',
      lg: '976px',
      xl: '1440px',
    },
    extend: {
      fontFamily: {
        workSans: ['Work Sans', 'sans-serif'],
      },
      colors: {
        customBlue: '#1DA1F2',
        customGreen: '#17BF63',
        customRed: '#FF695C',},
    },
  },
  plugins: [],
};
